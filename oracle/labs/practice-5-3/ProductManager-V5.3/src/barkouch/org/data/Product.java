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
 * @version 5.3
 * @author BarkouchMourad
 **/
public class Product {
    final private int id;
    final private String name;
    final private BigDecimal price;

    private Rating rating;

    /**
     * A constant that defines a
     * {@link java.math.BigDecimal BigDecimal } value of the discount rate
     * <br>
     * Discount rate is 10%.
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    public Product() {
        this(0,"no name",BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id,name, price, Rating.NOT_RATED);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
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

    public Product applyRating(Rating rating){
        return new Product(this.id, this.name,this.price,rating);
    }
    public Rating getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", rating=" + this.getRating().getStars() +
                '}';
    }
}
