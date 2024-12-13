package app_system.orders;
import app_system.accounts.*;
import app_system.restaurants.*;

import java.util.Date;
import java.util.ArrayList;


public class Order {

    // allergies or preferences(spicy/well-done)?
    private final User customer;
    private final Restaurant restaurant;
    private ArrayList <Cart_Item> order_items;
    private String deliveryAddress;
    private Date delivery_time; //not final due to delay or order change?
    private Payment payment_info;


    public Order(User customer, Restaurant restaurant, ArrayList<Cart_Item> order_items, String deliveryAddress,Date delivery_time,Payment payment_info){
        this.customer=customer;
        this.restaurant=restaurant;
        this.order_items=order_items;
        this.deliveryAddress=deliveryAddress;
        this.delivery_time=delivery_time;
        this.payment_info=payment_info;

    }

    public User getCustomer(){
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public Payment getPayment_info() {
        return payment_info;
    }

    public ArrayList<Cart_Item> getOrder_items() {
        return order_items;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }

    public void setPayment_info(Payment payment_info) {
        this.payment_info = payment_info;
    }


    public void setOrder_items(ArrayList<Cart_Item> order_items) {
        this.order_items= order_items;
    }


}
