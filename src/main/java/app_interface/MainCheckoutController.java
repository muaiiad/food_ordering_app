package app_interface;

import app_system.orders.Cart_Item;
import app_system.restaurants.Restaurant;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Separator;
import java.io.IOException;
import app_system.accounts.AccountsManager;

public class MainCheckoutController {

    @FXML
    private HBox cartlist;

    @FXML
    ImageView photores;

    @FXML
    Label name,description,price,options;

    public void CartInitialize() throws IOException {
        cartlist.getChildren().clear();
        int ind = 0;


        for (Cart_Item cartItem : AccountsManager.getUsers().get(0).getCart().getItems()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Cart/Cart_Item.fxml"));
            AnchorPane item = loader.load();

            MainCheckoutController itemController = loader.getController();

            itemController.setData(cartItem);
            cartlist.getChildren().add(item);
            cartlist.getChildren().add(new Separator());



        }
    }

    public void setData(Cart_Item cartItem) {

        name.setText(cartItem.getMenu_item().getName());
        description.setText(cartItem.getMenu_item().getDescription());
        price.setText("$" + cartItem.getMenu_item().getPrice());
        options.setText(cartItem.getMenu_item().getOptions());
    }

}

