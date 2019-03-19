package zad4.model.drink;

import zad4.model.Product;

import java.math.BigDecimal;

public abstract class Drink extends Product {
    private boolean syrup;

    public Drink(BigDecimal price, boolean syrup) {
        super(price);
        this.syrup = syrup;
    }

    public boolean isSyrup() {
        return syrup;
    }
}
