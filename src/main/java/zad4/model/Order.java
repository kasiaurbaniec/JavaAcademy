package zad4.model;

import java.math.BigDecimal;
import java.util.List;

public final class Order {
    public long getOrderID() {
        return orderID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private final long orderID;
    private final List<Product> products;
    private List<Extra> extras;
    private final BigDecimal price;

    public Order(long orderID, List<Product> products, List<Extra> extras, BigDecimal price) {
        this.orderID = orderID;
        this.products = products;
        this.extras = extras;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order " +
                "ID=" + orderID +",\n"+
                "products: " + products.toString()+"\n"+
                "extras: " + extras +"\n"+
                "Total price: " + price +
                '}';
    }
}
