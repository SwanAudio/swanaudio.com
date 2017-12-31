package controllers

import javax.inject.Inject

import scala.concurrent.ExecutionContext

import play.api.Configuration
import play.api.cache.Cached
import play.api.libs.ws.WSClient
import play.api.mvc.{Action,InjectedController}


class Twitter @Inject() (
  cached: Cached,
  config: Configuration,
  implicit val context: ExecutionContext,
  override val ws: WSClient
) extends InjectedController with utils.OAuth2 {

  val authUrl = "https://api.twitter.com/oauth2/token"
  val timelineUrl = "https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=swanaudio&count=2"
  val client = config.get[String]("twitter.oauth.client")
  val secret = config.get[String]("twitter.oauth.secret")

  def timeline = cached(_ => "twitter-timeline", duration=900) {
    Action.async { implicit request =>
      getToken(authUrl, client, secret) flatMap { token =>
        ws.url(timelineUrl)
          .withHeaders("Authorization" -> s"Bearer ${token getOrElse ""}")
          .get
          .map(response => Ok(response.body))
      }
    }
  }

}
