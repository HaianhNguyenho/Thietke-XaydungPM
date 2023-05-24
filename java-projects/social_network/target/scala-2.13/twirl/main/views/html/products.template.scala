
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""



"""),_display_(/*5.2*/main("Welcome")/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""
"""),_display_(/*6.2*/defining(play.core.PlayVersion.current)/*6.41*/ { version =>_display_(Seq[Any](format.raw/*6.54*/("""



"""),_display_(/*10.2*/main("Products")/*10.18*/{_display_(Seq[Any](format.raw/*10.19*/("""
    """),format.raw/*11.34*/("""

     """),format.raw/*13.6*/("""<!-- https://getbootstrap.com/docs/4.0/layout/grid/ -->
     <div class="row">
      <div class="col-md-2">

        <!-- https://getbootstrap.com/docs/4.0/components/list-group/ -->
        <div class="list-group">
          <a href="#" class="list-group-item  list-group-item-action">Tất cả danh mục sản phẩm</a>
        </div>

      </div>

      <div class="col-md-auto">
        <!-- https://getbootstrap.com/docs/4.0/content/tables/ -->
        <table class="table table-hover">
           <thead>
              <th scope="col">ID</th>
              <th scope="col">Tên SP</th>
              <th scope="col">Phân loại</th>
              <th scope="col">Mô tả</th>
              <th scope="col">SLTK</th>
              <th scope="col">Giá</th>
            </thead>
            <tbody>
            """),format.raw/*36.82*/("""
            """),format.raw/*37.56*/("""
           
              """),format.raw/*39.15*/("""<tr scope="row">
                <td>1</td>
                <td>LCD.TV</td>
                <td>Home Entertainment</td>
                <td>Sony 55 inch LCD TV</td>
                <td>10</td>
                <td class="text-right">&euro;"""),_display_(/*45.47*/("%.2f".format(850.00))),format.raw/*45.70*/("""</td>
              </tr>
              <tr scope="row">
                <td>2</td>
                <td>Bóng đèn</td>
                <td>Yên Bái</td>
                <td>Bóng đèn màu vàng</td>
                <td>3</td>
                <td class="text-right">&euro;"""),_display_(/*53.47*/("%.2f".format(90.000))),format.raw/*53.70*/("""</td>
              </tr>
              <tr scope="row">
                <td>3</td>
                <td>Đồng hồ</td>
                <td>Yên tử</td>
                <td>Đồng hồ màu đen</td>
                <td>5</td>
                <td class="text-right">&euro;"""),_display_(/*61.47*/("%.2f".format(600.000))),format.raw/*61.71*/("""</td>
              </tr>
              <tr scope="row">
                <td>4</td>
                <td>Lò viba</td>
                <td>Toàn quốc</td>
                <td>Viền đất màu nâu</td>
                <td>2</td>
                <td class="text-right">&euro;"""),_display_(/*69.47*/("%.2f".format(30.000))),format.raw/*69.70*/("""</td>
              </tr>
              <tr scope="row">
                <td>5</td>
                <td>Máy nén khí</td>
                <td>Tuyên Quang</td>
                <td>Bệnh viện</td>
                <td>6</td>
                <td class="text-right">&euro;"""),_display_(/*77.47*/("%.2f".format(2.300000))),format.raw/*77.72*/("""</td>
              </tr>
              <tr scope="row">
                <td>6</td>
                <td>Máy chiếu</td>
                <td>Toàn quốc</td>
                <td>Trường học</td>
                <td>2</td>
                <td class="text-right">&euro;"""),_display_(/*85.47*/("%.2f".format(5.300000))),format.raw/*85.72*/("""</td>
              </tr>
            """)))}),format.raw/*87.14*/(""" """),format.raw/*87.32*/("""
            """),format.raw/*88.13*/("""</tbody>

            
            <tfoot>
              
              
            </tfoot>
          </table>
      </div>

    

""")))}),format.raw/*100.2*/("""
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
                  SOURCE: app/views/products.scala.html
                  HASH: 4de004c1df99ad5cd28a57f2de2841a0c604862b
                  MATRIX: 903->1|999->3|1033->12|1056->27|1095->29|1123->32|1170->71|1220->84|1255->93|1280->109|1319->110|1353->145|1389->154|2243->1049|2285->1106|2342->1135|2614->1380|2658->1403|2960->1678|3004->1701|3302->1972|3347->1996|3649->2271|3693->2294|3994->2568|4040->2593|4338->2864|4384->2889|4456->2930|4485->2948|4527->2962|4704->3108
                  LINES: 27->1|32->1|36->5|36->5|36->5|37->6|37->6|37->6|41->10|41->10|41->10|42->11|44->13|67->36|68->37|70->39|76->45|76->45|84->53|84->53|92->61|92->61|100->69|100->69|108->77|108->77|116->85|116->85|118->87|118->87|119->88|131->100
                  -- GENERATED --
              */
          