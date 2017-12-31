package controllers

import javax.inject.Inject

import play.api.cache.Cached
import play.api.mvc.{Action,InjectedController}

class Application @Inject() (cached: Cached) extends InjectedController {

  def index = Action {
    Ok(views.html.main())
  }

  def angular(view: String) = index

}
