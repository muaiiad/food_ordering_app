


package app_system.accounts;

import java.util.ArrayList;

public class User extends Account {
    ArrayList<String> deliveryAddresses;
    //Cart cart;



    public User(String email, String username, String password, ArrayList<String> deliveryAddresses) {
        super(email, username, password);
        this.deliveryAddresses = deliveryAddresses;
    }

    public User(String email, String username, String password) {
        super(email, username, password);
    }


}
