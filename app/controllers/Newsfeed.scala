package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

object Newsfeed extends Controller {

  def index = Action {
    Ok(Json.obj("title" -> "Hello"))
  }

}
