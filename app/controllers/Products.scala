package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object Products extends Controller {

  def list = Action {
    val json = Json.arr(
      Json.obj(
        "id" -> 1,
        "name" -> "Product 1"
      ),
      Json.obj(
        "id" -> 2,
        "name" -> "Product 2"
      )
    )

    Ok(json)
  }

  def detail(id: Long) = Action {
    // Retreive based on ID
    // Temp: Static object
    val json = Json.obj(
      "id" -> 1,
      "name" -> "Product 1",
      "images" -> Json.arr(
        Json.obj(
          "url" -> "http://placehold.it/800x400",
          "label" -> "tmp",
          "alt" -> "tmp"
        ),
        Json.obj(
          "url" -> "http://placehold.it/100x100",
          "label" -> "tmp",
          "alt" -> "tmp"
        ),
        Json.obj(
          "url" -> "http://placehold.it/200x100",
          "label" -> "tmp",
          "alt" -> "tmp"
        )
      ),
      "graphs" -> Json.arr(
        Json.obj(
          "url" -> "tmp",
          "label" -> "tmp",
          "alt" -> "tmp"
        )
      ),
      "details" -> "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    )

    Ok(json)
  }
}
