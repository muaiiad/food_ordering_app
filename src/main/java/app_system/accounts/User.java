package app_system.accounts;

public class User extends Account {
    String []deliveryAddresses;
    //Cart cart;

    public User(String email, String username, String password, String[] deliveryAddresses) {
        super(email, username, password);
        this.deliveryAddresses = deliveryAddresses;
    }
}
