package zad4.model.drink;

import java.math.BigDecimal;

public class Mocha extends Coffee{
    private boolean seasoning;
    private static final BigDecimal price = BigDecimal.valueOf(6.3);

    public Mocha(BigDecimal price, boolean syrup, boolean soyMilk, boolean seasoning) {
        super(price, syrup, soyMilk);
        this.seasoning = seasoning;
    }

    public boolean isSeasoning() {
        return seasoning;
    }
}
