package controllers

import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test.Helpers._
import play.api.test._

@RunWith(classOf[JUnitRunner])
class ETagActionSpec extends Specification {

  val expectedEtag = "nothing interesting".hashCode.toString

  "etag action" should {

    "return description if requested" in new WithApplication {
      val home = route(FakeRequest(GET, "/etag/description")).get

      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
      contentAsString(home) must contain ("ETags are commonly used")
    }

    "return etag header for resource" in new WithApplication {
      val home = route(FakeRequest(GET, "/etag").withHeaders(("ETag", "111111"))).get

      status(home) must equalTo(OK)
      header("ETag", home) must equalTo(Some(expectedEtag))
      contentType(home) must beSome.which(_ == "text/plain")
      contentAsString(home) must contain("nothing interesting")
    }

    "return not modified for GET requests with same etag" in new WithApplication {
      val home = route(FakeRequest(GET, "/etag").withHeaders(("ETag", expectedEtag))).get

      status(home) must equalTo(NOT_MODIFIED)
      contentAsString(home) must be empty
    }

    "return not modified for HEAD request with same etag" in new WithApplication {
      val home = route(FakeRequest(HEAD, "/etag").withHeaders(("ETag", expectedEtag))).get

      status(home) must equalTo(NOT_MODIFIED)
      contentAsString(home) must be empty
    }
  }
}
