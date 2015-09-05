
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rainer/Workspace/ScalaPlayWorkshop/play/play-scala/conf/routes
// @DATE:Mon Aug 31 16:06:26 CEST 2015

package controllers.c_ws_recovery;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.c_ws_recovery.ReverseNonBlockingRecoveredProxyController NonBlockingRecoveredProxyController = new controllers.c_ws_recovery.ReverseNonBlockingRecoveredProxyController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.c_ws_recovery.javascript.ReverseNonBlockingRecoveredProxyController NonBlockingRecoveredProxyController = new controllers.c_ws_recovery.javascript.ReverseNonBlockingRecoveredProxyController(RoutesPrefix.byNamePrefix());
  }

}
