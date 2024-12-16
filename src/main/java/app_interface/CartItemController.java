package app_interface;

import app_system.orders.Cart_Item;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CartItemController {

    @FXML
    private Label description;

    @FXML
    private Label name;

    @FXML
    private Label options;

    @FXML
    private Label price;


    public void setData(Cart_Item cartItem) {

        name.setText(cartItem.getMenu_item().getName());
        description.setText(cartItem.getMenu_item().getDescription());
        price.setText("$" + cartItem.getMenu_item().getPrice());
        options.setText(cartItem.getMenu_item().getOptions());
    }
}
