
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rainer/Workspace/ScalaPlayWorkshop/play/play-scala/conf/routes
// @DATE:Mon Aug 31 16:06:26 CEST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  SimpleApplication_1: controllers.SimpleApplication,
  // @LINE:7
  BlockingProxyController_4: controllers.a_ws.BlockingProxyController,
  // @LINE:8
  NonBlockingProxyController_0: controllers.a_ws.NonBlockingProxyController,
  // @LINE:9
  NonBlockingRecoveredProxyController_2: controllers.c_ws_recovery.NonBlockingRecoveredProxyController,
  // @LINE:12
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SimpleApplication_1: controllers.SimpleApplication,
    // @LINE:7
    BlockingProxyController_4: controllers.a_ws.BlockingProxyController,
    // @LINE:8
    NonBlockingProxyController_0: controllers.a_ws.NonBlockingProxyController,
    // @LINE:9
    NonBlockingRecoveredProxyController_2: controllers.c_ws_recovery.NonBlockingRecoveredProxyController,
    // @LINE:12
    Assets_3: controllers.Assets
  ) = this(errorHandler, SimpleApplication_1, BlockingProxyController_4, NonBlockingProxyController_0, NonBlockingRecoveredProxyController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SimpleApplication_1, BlockingProxyController_4, NonBlockingProxyController_0, NonBlockingRecoveredProxyController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.SimpleApplication.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proxyBlocking""", """controllers.a_ws.BlockingProxyController.doProxy"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """proxy""", """controllers.a_ws.NonBlockingProxyController.doProxy"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recoveredProxy""", """controllers.c_ws_recovery.NonBlockingRecoveredProxyController.doProxy"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_SimpleApplication_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_SimpleApplication_index0_invoker = createInvoker(
    SimpleApplication_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SimpleApplication",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_a_ws_BlockingProxyController_doProxy1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proxyBlocking")))
  )
  private[this] lazy val controllers_a_ws_BlockingProxyController_doProxy1_invoker = createInvoker(
    BlockingProxyController_4.doProxy,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.a_ws.BlockingProxyController",
      "doProxy",
      Nil,
      "GET",
      """""",
      this.prefix + """proxyBlocking"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_a_ws_NonBlockingProxyController_doProxy2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("proxy")))
  )
  private[this] lazy val controllers_a_ws_NonBlockingProxyController_doProxy2_invoker = createInvoker(
    NonBlockingProxyController_0.doProxy,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.a_ws.NonBlockingProxyController",
      "doProxy",
      Nil,
      "GET",
      """""",
      this.prefix + """proxy"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_c_ws_recovery_NonBlockingRecoveredProxyController_doProxy3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recoveredProxy")))
  )
  private[this] lazy val controllers_c_ws_recovery_NonBlockingRecoveredProxyController_doProxy3_invoker = createInvoker(
    NonBlockingRecoveredProxyController_2.doProxy,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.c_ws_recovery.NonBlockingRecoveredProxyController",
      "doProxy",
      Nil,
      "GET",
      """""",
      this.prefix + """recoveredProxy"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_SimpleApplication_index0_route(params) =>
      call { 
        controllers_SimpleApplication_index0_invoker.call(SimpleApplication_1.index)
      }
  
    // @LINE:7
    case controllers_a_ws_BlockingProxyController_doProxy1_route(params) =>
      call { 
        controllers_a_ws_BlockingProxyController_doProxy1_invoker.call(BlockingProxyController_4.doProxy)
      }
  
    // @LINE:8
    case controllers_a_ws_NonBlockingProxyController_doProxy2_route(params) =>
      call { 
        controllers_a_ws_NonBlockingProxyController_doProxy2_invoker.call(NonBlockingProxyController_0.doProxy)
      }
  
    // @LINE:9
    case controllers_c_ws_recovery_NonBlockingRecoveredProxyController_doProxy3_route(params) =>
      call { 
        controllers_c_ws_recovery_NonBlockingRecoveredProxyController_doProxy3_invoker.call(NonBlockingRecoveredProxyController_2.doProxy)
      }
  
    // @LINE:12
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_3.versioned(path, file))
      }
  }
}