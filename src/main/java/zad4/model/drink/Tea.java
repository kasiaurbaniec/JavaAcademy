package zad4.model.drink;

import java.math.BigDecimal;

public abstract class Tea extends Drink{
    private int lemon;

    public Tea(BigDecimal price, boolean syrup, int lemon) {
        super(price, syrup);
        this.lemon = lemon;
    }

    public int getLemon() {
        return lemon;
    }
}
