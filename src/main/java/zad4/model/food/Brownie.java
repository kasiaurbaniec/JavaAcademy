package zad4.model.food;

import java.math.BigDecimal;

public class Brownie extends Cake{
    private boolean chutney;
    private static final BigDecimal price=BigDecimal.valueOf(7.4);

    public Brownie(boolean cream, boolean chockolateIcing, boolean chutney) {
        super(price, cream, chockolateIcing);
        this.chutney = chutney;
    }

    public boolean isChutney() {
        return chutney;
    }
}
