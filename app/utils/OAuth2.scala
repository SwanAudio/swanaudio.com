package utils

import java.nio.charset.StandardCharsets
import java.util.Base64

import scala.concurrent.{ExecutionContext,Future}

import play.api.libs.ws.{EmptyBody,WSClient}
import play.api.mvc.Results


trait OAuth2 {

  val ws: WSClient

  def getToken(endpoint: String, client: String, secret: String)
    (implicit ec: ExecutionContext): Future[Option[String]] = {

    val credentials = Base64.getEncoder
      .encodeToString(s"$client:$secret".getBytes(StandardCharsets.UTF_8))

    ws.url(endpoint)
      .addQueryStringParameters("grant_type" -> "client_credentials")
      .addHttpHeaders(
        "Authorization" -> s"Basic $credentials",
        "Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8"
      )
      .post(EmptyBody)
      .map(response => (response.json \ "access_token").asOpt[String])
  }

}
