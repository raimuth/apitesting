
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Application Index")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

    """),format.raw/*5.5*/("""<pre>
        """),_display_(/*6.10*/message),format.raw/*6.17*/("""
    """),format.raw/*7.5*/("""</pre>

""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Aug 31 16:06:27 CEST 2015
                  SOURCE: /home/rainer/Workspace/ScalaPlayWorkshop/play/play-scala/app/views/index.scala.html
                  HASH: d406c2c4ccc2d2e1de60afcb1bfe037d49b6d065
                  MATRIX: 527->1|639->18|667->21|700->46|739->48|771->54|812->69|839->76|870->81|908->90
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|30->6|30->6|31->7|33->9
                  -- GENERATED --
              */
          