package zad4.service;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import zad4.model.Extra;
import zad4.model.Order;
import zad4.model.Product;
import zad4.model.drink.IceLatte;
import zad4.model.drink.MintTea;
import zad4.model.food.Brownie;
import zad4.model.food.IceCreamChocolate;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static zad4.model.Extra.*;

class OrderServiceTest {
    private List<Product> listProducts;
    private List<Product> listProducts2;
    private List<Product> listProductsEmpty;
    private List<Extra> extraList;
    private List<Extra> extraList2;
    private OrderService orderService;

    @Rule
    public ExpectedException e = ExpectedException.none();

    @BeforeEach
    public void setUp() {
        listProducts = new LinkedList<>();
        listProducts2 = new LinkedList<>();
        listProductsEmpty = new LinkedList<>();
        listProducts.add(new IceLatte(true, false, 5));
        listProducts.add(new Brownie(true, true, false));
        listProducts2.add(new MintTea(true, 2, false));
        listProducts2.add(new IceCreamChocolate(true, 2));
        extraList = new LinkedList<>();
        extraList2 = new LinkedList<>();
        extraList.add(SUGAR);
        extraList.add(COCOA);
        extraList2.add(CREAM);
        orderService = new OrderService();
    }

    @Test
    public void createOrder() {
        //When
        Order order = orderService.createOrder(listProducts, extraList);
        Order order2 = orderService.createOrder(listProducts2, extraList2);
        //Then
        assertThat(order.getExtras()).isNotNull();
        assertThat(order.getExtras()).isEqualTo(extraList);
        assertThat(order2.getExtras()).isEqualTo(extraList2);
        assertThat(order.getOrderID()).isEqualTo(0);
        assertThat(order2.getOrderID()).isEqualTo(1);
        assertThat(order.getProducts()).isEqualTo(listProducts);
        assertThat(order2.getProducts()).isEqualTo(listProducts2);
        System.out.println(order.toString());
        System.out.println(order2.toString());
    }

    @Test
    public void checkEmptyOrderException() {
        //When
        e.expect(EmptyOrderException.class);
        orderService.createOrder(listProductsEmpty, extraList2);



    }
}