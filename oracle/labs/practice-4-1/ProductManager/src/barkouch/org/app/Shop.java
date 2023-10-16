/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package barkouch.org.app;

import barkouch.org.data.Product;

import java.math.BigDecimal;

/**
 * @author BarkouchMourad
 **/
public class Shop {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(101);
        product.setName("Tea");
        product.setPrice(BigDecimal.valueOf(1.99));

        System.out.println("Id : "+product.getId());
        System.out.println("Name : "+product.getName());
        System.out.println("Price : "+product.getPrice());
    }
}
