package zad4.model;

import java.math.BigDecimal;

public enum Extra {
    SUGAR(BigDecimal.valueOf(0.2)),
    MILK(BigDecimal.valueOf(1.2)),
    ESPRESSO(BigDecimal.valueOf(3.5)),
    COCOA(BigDecimal.valueOf(2.4)),
    CREAM(BigDecimal.valueOf(1.6)),
    WAFER(BigDecimal.valueOf(2.8));
    private BigDecimal price;

    Extra(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
