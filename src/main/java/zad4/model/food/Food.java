package zad4.model.food;

import zad4.model.Product;

import java.math.BigDecimal;

public abstract class Food extends Product {
    private boolean cream;

    public Food(BigDecimal price, boolean cream) {
        super(price);
        this.cream = cream;
    }

    public boolean isCream() {
        return cream;
    }
}
