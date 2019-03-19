package zad4.model.drink;

import java.math.BigDecimal;

public class IceLatte extends Coffee {
    private int iceCubes;
    private static final BigDecimal price = BigDecimal.valueOf(5.5);

    public IceLatte(boolean syrup, boolean soyMilk, int iceCubes) {
        super(price, syrup, soyMilk);
        this.iceCubes = iceCubes;
    }

    public int getIceCubes() {
        return iceCubes;
    }

    public IceLatte(BigDecimal price, boolean syrup, boolean soyMilk) {
        super(price, syrup, soyMilk);
    }
}

