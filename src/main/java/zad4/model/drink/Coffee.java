package zad4.model.drink;

import java.math.BigDecimal;

public abstract class Coffee extends Drink{
private boolean soyMilk;

    public Coffee(BigDecimal price, boolean syrup, boolean soyMilk) {
        super(price, syrup);
        this.soyMilk = soyMilk;
    }

    public boolean isSoyMilk() {
        return soyMilk;
    }
}
