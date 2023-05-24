package controllers;

import models.Product;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }
    public Result about(){
        return ok(views.html.about.render());
    }
    public Result products(){
        //create a new product
        Product p = new Product();
        //set for p
        p.setId(1L);
        p.setName("LCD TV");
        p.setDescription("Sony 55 inch LCD TV");
        p.setStock(10);
        p.setPrice(850.00);

        Product p2 = new Product(1L, "LCD TV", "Home", "LG 55inch OLED TV", 10, 2000.00);
        return ok(views.html.products.render());
    }
}
