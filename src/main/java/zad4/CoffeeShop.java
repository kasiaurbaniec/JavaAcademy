package zad4;

import zad4.model.Extra;
import zad4.model.Order;
import zad4.model.Product;
import zad4.service.OrderService;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CoffeeShop {
    private OrderService orderService;
    private Map<Long, Order> ordersPending;
    private Map<Long, Order> ordersDone;

    public Map<Long, Order> getOrdersPending() {
        return ordersPending;
    }

    public Map<Long, Order> getOrdersDone() {
        return ordersDone;
    }

    public CoffeeShop() {
        this.orderService = orderService;
        this.ordersPending = ordersPending;
        this.ordersDone = ordersDone;
    }

    public Order createOrder(List<Product> products, List<Extra> extras) {
        Order newOrder = orderService.createOrder(products, extras);
        ordersPending.put(newOrder.getOrderID(), newOrder);
        return newOrder;
    }

    public void orderDone(long orderID) {
        if (ordersPending.containsKey(orderID)) {
            Order orderInPreparation = ordersPending.get(orderID);
            ordersPending.remove(orderID);
            ordersDone.put(orderID, orderInPreparation);
        } else System.out.println("There is no such order");
    }
}