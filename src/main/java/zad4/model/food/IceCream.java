package zad4.model.food;

import java.math.BigDecimal;

public abstract class IceCream extends Food{
    private int wafers;

    public IceCream(BigDecimal price, boolean cream, int wafers) {
        super(price, cream);
        this.wafers = wafers;
    }

    public int getWafers() {
        return wafers;
    }
}
