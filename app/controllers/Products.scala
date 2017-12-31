package controllers

import javax.inject.Inject

import scala.concurrent.ExecutionContext

import play.api.cache.Cached
import play.api.mvc.{Action,InjectedController}

import io.circe.generic.auto._
import io.circe.syntax._

import models.{Product, ProductSpecification}

class Products @Inject() (
  cached: Cached,
  implicit val context: ExecutionContext
) extends InjectedController {

  def list = Action {
    val products: Seq[Product] = Seq(
      Product(
        0, "Instrument Cable", "instrument_cable", "/assets/cable-plug.svg",
        "",
        "For all of life's treble",
        Seq(
          "Wide Tonal Response",
          "Reduced Microphonics"
        ),
        Seq(),
        Seq(
          ProductSpecification("Wire Size", "7 x 0.20mm"),
          ProductSpecification("Shield 1", "90 x 0.10mm"),
          ProductSpecification("Shield 2", "98 x 0.10mm")
        )
      ),
      Product(
        0, "Microphone Cable", "microphone_cable", "/assets/cable-xlr.svg",
        "",
        "A Major improvement",
        Seq(),
        Seq(),
        Seq()
      )
    )

    Ok(products.asJson)
  }

}
