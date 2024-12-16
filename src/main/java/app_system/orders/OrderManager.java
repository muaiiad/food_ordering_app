package app_system.orders;

import java.util.ArrayList;

public class OrderManager {
    private static ArrayList<Order> orders=new ArrayList<>();

    public static void setOrders(ArrayList<Order>orders)
    {
        OrderManager.orders=orders;
    }
    public static ArrayList<Order>getOrders(){return orders;}
}
