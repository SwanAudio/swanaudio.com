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
            "main-images" -> Json.arr(
                Json.obj(
                    "url" -> "tmp",
                    "label" -> "tmp",
                    "alt" -> "tmp"
                )
            ),
            "aux-images" -> Json.arr(
                Json.obj(
                    "url" -> "tmp",
                    "label" -> "tmp",
                    "alt" -> "tmp"
                )
            ),
            "details" -> "todo"
        )
        Ok(json)
    }
}
