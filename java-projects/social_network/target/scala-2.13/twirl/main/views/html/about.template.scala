
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),_display_(/*4.2*/main("Welcome")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""

"""),_display_(/*7.2*/main("About Us")/*7.18*/{_display_(Seq[Any](format.raw/*7.19*/("""
    """),format.raw/*8.35*/("""
  """),format.raw/*9.3*/("""<h1>The About Us Page</h1>
  <h2>message</h2>
  <h3>email@me.com</h3>
""")))}),format.raw/*12.2*/("""
""")))}),format.raw/*13.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/about.scala.html
                  HASH: 86579a61dc364c7d9ccf1aac6fcbaf816fb552bb
                  MATRIX: 900->1|996->3|1028->10|1051->25|1090->27|1118->30|1165->69|1215->82|1245->87|1269->103|1307->104|1340->140|1370->144|1474->219|1507->222
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|36->5|36->5|38->7|38->7|38->7|39->8|40->9|43->12|44->13
                  -- GENERATED --
              */
          