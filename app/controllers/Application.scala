package controllers

import javax.inject.Inject

import play.api.cache.Cached
import play.api.mvc.Action
import play.api.mvc.Controller

class Application @Inject() (cached: Cached) extends Controller {

  def index = Action {
    Ok(views.html.main())
  }

  def angular(view: String) = index

}
