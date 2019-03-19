package zad4.model;

import java.math.BigDecimal;

public abstract class Product {
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                " price: " + price;
    }

    public Product(BigDecimal price) {
        this.price = price;

    }
}
