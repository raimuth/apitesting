
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rainer/Workspace/ScalaPlayWorkshop/play/play-scala/conf/routes
// @DATE:Mon Aug 31 16:06:26 CEST 2015

package controllers.a_ws;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.a_ws.ReverseNonBlockingProxyController NonBlockingProxyController = new controllers.a_ws.ReverseNonBlockingProxyController(RoutesPrefix.byNamePrefix());
  public static final controllers.a_ws.ReverseBlockingProxyController BlockingProxyController = new controllers.a_ws.ReverseBlockingProxyController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.a_ws.javascript.ReverseNonBlockingProxyController NonBlockingProxyController = new controllers.a_ws.javascript.ReverseNonBlockingProxyController(RoutesPrefix.byNamePrefix());
    public static final controllers.a_ws.javascript.ReverseBlockingProxyController BlockingProxyController = new controllers.a_ws.javascript.ReverseBlockingProxyController(RoutesPrefix.byNamePrefix());
  }

}
