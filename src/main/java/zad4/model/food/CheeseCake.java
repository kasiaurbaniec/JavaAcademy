package zad4.model.food;

import java.math.BigDecimal;

public class CheeseCake extends Cake{
    private boolean freshFruits;
    private static final BigDecimal price=BigDecimal.valueOf(9.5);

    public CheeseCake(boolean cream, boolean chockolateIcing, boolean freshFruits) {
        super(price, cream, chockolateIcing);
        this.freshFruits = freshFruits;
    }

    public boolean isFreshFruits() {
        return freshFruits;
    }
}
