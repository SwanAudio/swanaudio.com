package controllers

import javax.inject.Inject

import scala.concurrent.ExecutionContext

import play.api.cache.Cached
import play.api.libs.ws.WSClient
import play.api.libs.json._
import play.api.mvc.{Action,InjectedController}


class Instagram @Inject() (
  cached: Cached,
  implicit val context: ExecutionContext,
  override val ws: WSClient
) extends InjectedController with utils.OAuth2 {

  val recentUrl = "https://www.instagram.com/swan.audio/media/"

  def recent = cached(_ => "instagram-recent", duration=900) {
    Action.async { implicit request =>
      ws.url(recentUrl)
        .addHttpHeaders("Accept" -> "application/json")
        .get
        .map(response => (response.json \ "items").as[Seq[JsValue]])
        .map(_.take(10))
        .map(response => Ok(Json.toJson(response)))
    }
  }

}
