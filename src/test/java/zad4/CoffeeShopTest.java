package zad4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zad4.model.Extra;
import zad4.model.Product;
import zad4.model.drink.IceLatte;
import zad4.model.drink.MintTea;
import zad4.model.food.Brownie;
import zad4.model.food.IceCreamChocolate;
import zad4.service.OrderService;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static zad4.model.Extra.*;

class CoffeeShopTest {
    private List<Product> listProducts;
    private List<Product> listProducts2;
    private List<Product> listProductsEmpty;
    private List<Extra> extraList;
    private List<Extra> extraList2;
CoffeeShop coffeeShop;
    @BeforeEach
    void setUp() {
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
        coffeeShop=new CoffeeShop();
    }

    @Test
    void createOrder() {
        coffeeShop.createOrder(listProducts,extraList);
//        System.out.println(coffeeShop.getOrdersDone().get(0).toString());
    }

    @Test
    void orderDone() {
    }
}