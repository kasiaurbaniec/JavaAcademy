package zad4.service;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager;
import zad4.model.Extra;
import zad4.model.Order;
import zad4.model.Product;

import java.math.BigDecimal;
import java.util.List;

public class OrderService {
    private static long currentOrderNumber;

    public OrderService() {
        this.currentOrderNumber = 0;
    }

    public Order createOrder(List<Product> products, List<Extra> extras) {
        if (products.size() == 0) {
            throw new EmptyOrderException();
        } else {
            BigDecimal productsPrice = products.stream()
                    .map(Product::getPrice)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            BigDecimal extrasPrice = extras.stream()
                    .map(Extra::getPrice)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            BigDecimal summaryPrice = productsPrice.add(extrasPrice);
            long newOrderNumber = currentOrderNumber;
            currentOrderNumber++;
            return new Order(newOrderNumber, products, extras, summaryPrice);
        }
    }
}
