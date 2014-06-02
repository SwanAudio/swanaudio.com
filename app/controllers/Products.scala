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
              "id" -> "1",
              "value" -> "1 Meter"
            ),
            Json.obj(
              "id" -> "2",
              "value"-> "2 Meter"
            ),
            Json.obj(
              "id" -> "3",
              "value" -> "3 Meter"
            )
          )
        )
      ),
      "specs" -> Json.arr(
        Json.obj(
          "key" -> "Capacitance @ 100Hz",
          "measure" -> "75pF +/- 5pF"
        ),
        Json.obj(
          "key" -> "Capacitance @ 10kHz",
          "measure" -> "85pF +/- 10pF"
        ),
        Json.obj(
          "key" -> "3dB Low Frequency",
          "measure" -> "24Hz +/- 2Hz"
        ),
        Json.obj(
          "key" -> "3dB High Frequency",
          "measure" -> "111kHz +/- 10kHz"
        ),
        Json.obj(
          "key" -> "Conductor ohms / m",
          "measure" -> "0.5 ohm +/ 0.1ohm"
        ),
        Json.obj(
          "key" -> "Shield ohms / m",
          "measure" -> "0.8 ohm +/ 0.1ohm"
        ),
        Json.obj(
          "key" -> "Bend Radius",
          "measure" -> "0.25 m"
        ),
        Json.obj(
          "key" -> "Conductor Size",
          "measure" -> "22 AWG"
        ),
        Json.obj(
          "key" -> "Shield Size",
          "measure" -> "22 AWG"
        ),
        Json.obj(
          "key" -> "Primary Shield Type",
          "measure" -> "Double Reussen Copper Weave"
        ),
        Json.obj(
          "key" -> "Secondary Shield Type",
          "measure" -> "Radiated Carbon Jacket"
        ),
        Json.obj(
          "key" -> "Cable Outer Jacket",
          "measure" -> "Black PVC"
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
