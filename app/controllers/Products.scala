package controllers

import javax.inject.Inject

import scala.concurrent.ExecutionContext

import play.api.cache.Cached
import play.api.mvc.{Action,Controller}


class Products @Inject() (
  cached: Cached,
  implicit val context: ExecutionContext
) extends Controller {

  def list = Action {
    Ok
  }

}
