package zad4.model.food;

import java.math.BigDecimal;

public class IceCreamVanilla extends IceCream {
    private static final BigDecimal price=BigDecimal.valueOf(5.0);

    public IceCreamVanilla(boolean cream, int wafers) {
        super(price, cream, wafers);
    }

}
