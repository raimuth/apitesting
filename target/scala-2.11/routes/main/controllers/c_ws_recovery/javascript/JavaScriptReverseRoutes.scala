
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rainer/Workspace/ScalaPlayWorkshop/play/play-scala/conf/routes
// @DATE:Mon Aug 31 16:06:26 CEST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.c_ws_recovery.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseNonBlockingRecoveredProxyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def doProxy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.c_ws_recovery.NonBlockingRecoveredProxyController.doProxy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recoveredProxy"})
        }
      """
    )
  
  }


}