import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.text.NumberFormat; 
import java.text.NumberFormat.Style;

public class HandleNumbers{
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(1.85);
        BigDecimal rate = BigDecimal.valueOf(0.06533);
        int customersNum = 100000;

        price = price.subtract(price.multiply(rate)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(price);

        Locale localeFr = Locale.US;
        System.out.println(localeFr);

        NumberFormat priceFormat = NumberFormat.getCurrencyInstance(localeFr);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(localeFr);
        percentFormat.setMaximumFractionDigits(2);
        NumberFormat compactFormat = NumberFormat.getCompactNumberInstance(localeFr, Style.SHORT);

        System.out.println("prix : "+priceFormat.format(price));
        System.out.println("Percentage : "+percentFormat.format(rate));
        System.out.println("clients : "+compactFormat.format(customersNum));

    }
}