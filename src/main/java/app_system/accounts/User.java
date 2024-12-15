
package app_system.accounts;

import app_system.orders.Cart;

import java.util.ArrayList;

public class User extends Account {
    String deliveryAddress;
    Cart cart = new Cart();


    public User() {

    }

    public User(String email, String username, String password, String deliveryAddress) {
        super(email, username, password);
        this.deliveryAddress = deliveryAddress;
    }

    public User(String email, String username, String password) {
        super(email, username, password);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddresses(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
