

package barkouch.org.app;

import barkouch.org.data.Product;
import static barkouch.org.data.Rating.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * {@code Shop} class represents an application that manages Products.
 * @version 5.3
 * @author BarkouchMourad
 **/
public class Shop {
    public static void main(String[] args) {
        Product tea = new Product(101,"Tea",BigDecimal.valueOf(4.99), FIVE_STAR);
        Product cake = new Product(102,"cake",BigDecimal.valueOf(5.99));
        Product coffee = new Product(103,"Coffee",BigDecimal.valueOf(2.99), THREE_STAR);
        Product p1  = cake.applyRating(TWO_STAR);
        Product product = new Product();


        List.of(tea,cake,coffee,p1, product).forEach(p ->
                System.out.println(p.getId()+" : "+p.getName()+" : "+p.getPrice()+" : "+p.getDiscountRate()+" : "+p.getRating().getStars())
        );
    }
}
