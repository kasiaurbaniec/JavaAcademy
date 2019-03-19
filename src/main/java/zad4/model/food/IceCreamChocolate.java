package zad4.model.food;

import java.math.BigDecimal;

public class IceCreamChocolate extends IceCream{
    private static final BigDecimal price=BigDecimal.valueOf(5.0);

    public IceCreamChocolate(boolean cream, int wafers) {
        super(price, cream, wafers);
    }
}
