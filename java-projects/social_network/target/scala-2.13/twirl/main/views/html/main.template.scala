
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href=""""),_display_(/*16.29*/routes/*16.35*/.Assets.versioned("images/favicon.ico")),format.raw/*16.74*/("""">

    <title> Nhóm 5 </title>

    <!-- Bootstrap 4.0 core CSS -->
    <link rel="stylesheet" 
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
          crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*27.65*/("""" rel="stylesheet">
  </head>

  <body>

    <!-- Navigation Menu-->
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">

      <!-- Page 'brtand' (top left)-->
      <a class="navbar-brand" href=""""),_display_(/*36.38*/routes/*36.44*/.HomeController.index),format.raw/*36.65*/("""">Danh mục sản phẩm</a>

      <!-- Responsive menu button - display when page is collapsed (e.g. mobile) -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Navigation Links-->
      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">

          <!-- Each link is a list item <li> -->
          <!-- nav-item active used to highlight current page-->

          <!-- Home -->
          <li class="nav-item active">
            <a class="nav-link" href=""""),_display_(/*52.40*/routes/*52.46*/.HomeController.index),format.raw/*52.67*/("""">Trang chủ <span class="sr-only">(current)</span></a>
          </li>

          <!-- About -->
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*57.40*/routes/*57.46*/.HomeController.about),format.raw/*57.67*/("""">Thông tin</a>
          </li>
          
          <!-- Products -->
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*62.40*/routes/*62.46*/.HomeController.products),format.raw/*62.70*/("""">Sản phẩm</a>
          </li>

          <!-- Products -->
          <!-- This link is disabled (as an example) -->
          <li class="nav-item">
            <a class="nav-link disabled" href="#">Liên hệ</a>
          </li>

          <!-- Example Dropdown menu (# links point to this page) -->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Thả xuống</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="#">Action</a>
              <a class="dropdown-item" href="#">Another action</a>
              <a class="dropdown-item" href="#">Something else here</a>
            </div>
          </li>
        </ul> <!-- End of Nav list-->
        
        <!-- Example search box (doesn't work yet!) -->
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Tìm kiếm</button>
        </form>
      </div>
    </nav>

    <!-- Content area-->
    <main role="main" class="container-fluid">
      <!-- Page content goes here -->
      """),_display_(/*93.8*/content),format.raw/*93.15*/("""

    """),format.raw/*95.5*/("""</main><!-- /.container -->

    <!-- Page Footer-->
    <!-- css class .footer defined in ./css/style.css -->
   

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 46141bde9910386d958db02584d14c473e899fbb
                  MATRIX: 1165->260|1289->291|1316->292|1608->557|1623->563|1683->602|2088->980|2103->986|2165->1027|2410->1245|2425->1251|2467->1272|3235->2013|3250->2019|3292->2040|3487->2208|3502->2214|3544->2235|3713->2377|3728->2383|3773->2407|5114->3722|5142->3729|5175->3735
                  LINES: 32->7|37->8|38->9|45->16|45->16|45->16|56->27|56->27|56->27|65->36|65->36|65->36|81->52|81->52|81->52|86->57|86->57|86->57|91->62|91->62|91->62|122->93|122->93|124->95
                  -- GENERATED --
              */
          