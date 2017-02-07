package controllers

import javax.inject.Inject

import scala.concurrent.ExecutionContext

import play.Configuration
import play.api.cache.Cached
import play.api.libs.ws.WSClient
import play.api.libs.json._
import play.api.mvc.{Action,Controller}


class Instagram @Inject() (
  cached: Cached,
  config: Configuration,
  implicit val context: ExecutionContext,
  override val ws: WSClient
) extends Controller with utils.OAuth2 {

  val recentUrl = "https://www.instagram.com/swan.audio/media/"

  def recent = cached(_ => "instagram-recent", duration=900) {
    Action.async { implicit request =>
      ws.url(recentUrl)
        .withHeaders("Accept" -> "application/json")
        .get
        .map(response => (response.json \ "items").as[Seq[JsValue]])
        .map(_.take(10))
        .map(response => Ok(Json.toJson(response)))
    }
  }

}