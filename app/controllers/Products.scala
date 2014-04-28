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
      "options" -> Json.arr(
        Json.obj(
          "type" -> "drop",
          "label" -> "Cable Length",
          "options" -> Json.arr(
            Json.obj(
              "1" -> "1 Meter",
              "2" -> "2 Meter",
              "3" -> "3 Meter"
            )
          )
        )
      ),
      "specs" -> Json.arr(
        Json.obj(
          "Capacitance @ 100Hz" -> "75pF +/- 5pF",
          "Capacitance @ 10kHz" -> "85pF +/- 10pF",
          "3dB Low Frequency" -> "24Hz +/- 2Hz",
          "3dB High Frequency" -> "111kHz +/- 10kHz",
          "Conductor ohms / m" -> "0.5 ohm +/ 0.1ohm",
          "Shield ohms / m" -> "0.8 ohm +/ 0.1ohm",
          "Bend Radius" -> "0.25 m",
          "Conductor Size" -> "22 AWG",
          "Shield Size" -> "22 AWG",
          "Primary Shield Type" -> "Double Reussen Copper Weave",
          "Secondary Shield Type" -> "Radiated Carbon Jacket",
          "Cable Outer Jacket" -> "Black PVC"
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
