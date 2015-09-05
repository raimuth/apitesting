
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rainer/Workspace/ScalaPlayWorkshop/play/play-scala/conf/routes
// @DATE:Mon Aug 31 16:06:26 CEST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.a_ws.javascript {
  import ReverseRouteContext.empty

  // @LINE:8
  class ReverseNonBlockingProxyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def doProxy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.a_ws.NonBlockingProxyController.doProxy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proxy"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseBlockingProxyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def doProxy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.a_ws.BlockingProxyController.doProxy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "proxyBlocking"})
        }
      """
    )
  
  }


}