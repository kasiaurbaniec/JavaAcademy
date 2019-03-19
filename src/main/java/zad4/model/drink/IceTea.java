package zad4.model.drink;

import java.math.BigDecimal;

public class IceTea extends Tea{
    private boolean mint;
    private static final BigDecimal price = BigDecimal.valueOf(4.2);

    public IceTea(boolean syrup, int lemon, boolean mint) {
        super(price, syrup, lemon);
        this.mint = mint;
    }

    public boolean isMint() {
        return mint;
    }
}
