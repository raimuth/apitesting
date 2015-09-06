package controllers

import play.api.mvc.{Action, AnyContent, Controller}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


class ETagAction extends Controller {

  def etagDesciption = Action {
    Ok(views.html.etagdescription())
  }

  def etagExample(): Action[AnyContent] = Action.async { request => {

    val staticContent = "nothing interesting"
    val staticEtag = staticContent.hashCode().toString
    val maybeEtag = request.headers.get("ETag")

    maybeEtag match {
      case Some(etag: String) => {
        if(staticEtag.equals(etag))
          Future(NotModified)
        else
          Future(Ok(staticContent).withHeaders(("ETag", staticEtag)))
      }
      case _ => Future(Ok(staticContent).withHeaders(("ETag", staticEtag)))
    }
  }}
}
