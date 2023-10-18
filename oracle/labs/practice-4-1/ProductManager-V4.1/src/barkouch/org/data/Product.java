package barkouch.org.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_DOWN;

/**
 * {@code Product} class represents properties and behaviours
 * of product objects in the Product Management System.
 * <br>
 * Each product has an id, name, price.
 * <br>
 * Each product can have a discount, calculated based on a
 * {@link java.math.BigDecimal DISCOUNT_RATE }
 * @version 4.1
 * @author BarkouchMourad
 **/
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    /**
     * A constant that defines a
     * {@link java.math.BigDecimal BigDecimal } value of the discount rate
     * <br>
     * Discount rate is 10%.
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(.1);

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Calculates discount based on a product price and
     * {@code  DISCOUNT_RATE discount rate}
     *
     * @return a {@link java.math.BigDecimal BigDecimal}
     * value of the discount
     */
    public BigDecimal getDiscountRate(){
    return price.multiply(DISCOUNT_RATE).setScale(2, HALF_DOWN);
    }
}
