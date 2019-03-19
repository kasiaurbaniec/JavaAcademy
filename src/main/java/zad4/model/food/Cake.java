package zad4.model.food;

import java.math.BigDecimal;

public abstract class Cake extends Food{
    private boolean chockolateIcing;

    public Cake(BigDecimal price, boolean cream, boolean chockolateIcing) {
        super(price, cream);
        this.chockolateIcing = chockolateIcing;
    }

    public boolean isChockolateIcing() {
        return chockolateIcing;
    }
}
