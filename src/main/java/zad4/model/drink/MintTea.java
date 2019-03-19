package zad4.model.drink;

import java.math.BigDecimal;

public class MintTea extends Tea{
    private boolean longBrewed;
    private static final BigDecimal price = BigDecimal.valueOf(4.0);

    public MintTea(boolean syrup, int lemon, boolean longBrewed) {
        super(price, syrup, lemon);
        this.longBrewed = longBrewed;
    }

    public boolean isLongBrewed() {
        return longBrewed;
    }
}
