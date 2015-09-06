package controllers

import play.api.mvc.{Action, Controller}

class SimpleApplication extends Controller {

  def index = Action { // => play.api.mvc.ActionBuilder.apply(block: => Result): Action[AnyContent]
    Ok(views.html.index("Your new application is ready."))
  }
}
