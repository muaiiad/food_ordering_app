


package app_system.accounts;

import app_system.orders.Cart;

import java.util.ArrayList;

public class User extends Account {
    ArrayList<String> deliveryAddresses;
    Cart cart;



    public User(String email, String username, String password, ArrayList<String> deliveryAddresses) {
        super(email, username, password);
        this.deliveryAddresses = deliveryAddresses;
    }

    public User(String email, String username, String password) {
        super(email, username, password);
    }

    public ArrayList<String> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(ArrayList<String> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
