package controllers

import javax.inject.Inject

import scala.concurrent.ExecutionContext

import play.api.cache.Cached
import play.api.libs.ws.WSClient
import play.api.mvc.{Action,InjectedController}

import io.circe._


class Instagram @Inject() (
  cached: Cached,
  implicit val context: ExecutionContext,
  override val ws: WSClient
) extends InjectedController with utils.OAuth2 {

  val recentUrl = "https://www.instagram.com/graphql/query/?query_id=17888483320059182&variables=%7B%22id%22%3A%224514254001%22%2C%22first%22%3A10%2C%22after%22%3Anull%7D"

  def recent = cached(_ => "instagram-recent", duration=900) {
    Action.async { implicit request =>
      ws.url(recentUrl)
        .addHttpHeaders("Accept" -> "application/json")
        .get
        .map(response => parser.parse(response.body).getOrElse(Json.Null))
        .map(_.hcursor
          .downField("data")
          .downField("user")
          .downField("edge_owner_to_timeline_media")
          .downField("edges")
          .focus
          .getOrElse(Json.Null)
        )
        .map(json => Ok(json.noSpaces))
    }
  }

}
