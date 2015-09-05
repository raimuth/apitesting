package controllers

import play.api.Play.current
import play.api.libs.ws.{WS, WSRequest, WSResponse}
import play.api.mvc.{Action, AnyContent, Controller, Result}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class SimpleApplication extends Controller {

  def index = Action { // => play.api.mvc.ActionBuilder.apply(block: => Result): Action[AnyContent]
    Ok(views.html.index("Your new application is ready."))
  }

  def etagExample(): Action[AnyContent] = Action.async { request => {

      val staticEtag = "444455"
      val maybeEtag = request.headers.get("ETag")

      if(maybeEtag.isDefined) {
        val etag = maybeEtag.getOrElse("undefined")

        if(staticEtag.equals(etag)) {
          Future(NotModified)
        } else {
          Future(Ok(views.html.index("foo")).withHeaders(("ETag", staticEtag)))
        }
      } else {
        Future(Ok(views.html.index("foo")).withHeaders(("ETag", staticEtag)))
      }

    }
  }

}
