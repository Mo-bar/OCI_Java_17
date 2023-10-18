

package barkouch.org.app;

import barkouch.org.data.Product;

import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manages Products.
 * @version 17.8.1
 * @author BarkouchMourad
 **/
public class Shop {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(101);
        product.setName("Tea");
        product.setPrice(BigDecimal.valueOf(3.99));

        System.out.println("Id : "+product.getId());
        System.out.println("Name : "+product.getName());
        System.out.println("Price : "+product.getPrice());
        System.out.println("Discount : "+product.getDiscountRate());
    }
}
