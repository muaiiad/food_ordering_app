package app_system.orders;
import app_system.accounts.*;
import app_system.restaurants.*;

import java.util.Date;
import java.util.ArrayList;


public class Order {
    private String order_status;
    private  User customer;
    private Restaurant restaurant;
    private ArrayList <Cart_Item> order_items;
    private String deliveryAddress,deliverytime;
    private Payment payment_info;
    private String status;


    public Order(String order_status,User customer, Restaurant restaurant, ArrayList<Cart_Item> order_items,Payment payment_info){
//        this.order_status=order_status;
        this.customer=customer;
        this.restaurant=restaurant;
        this.order_items=order_items;
        this.payment_info=payment_info;

    }

    public Order( String deliveryAddress,String deliverytime){
        this.deliveryAddress=deliveryAddress;
        this.deliverytime=deliverytime;

    }

    public String getOrderStatus() {
        return order_status;
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


    public Payment getPayment_info() {
        return payment_info;
    }

    public ArrayList<Cart_Item> getOrder_items() {
        return order_items;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setPayment_info(Payment payment_info) {
        this.payment_info = payment_info;
    }

    public void setOrder_items(ArrayList<Cart_Item> order_items) {
        this.order_items= order_items;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant= restaurant;
    }

    public void setCustomer(User customer) {
        this.customer= customer;
    }
    public void setOrder_status(String order_status){
        this.order_status= order_status;
    }

}
