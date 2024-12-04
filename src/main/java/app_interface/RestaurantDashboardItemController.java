package app_interface;

import app_system.restaurants.Restaurant;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class RestaurantDashboardItemController {

    @FXML
    private Label ratingText;

    @FXML
    private Label restAddress;

    @FXML
    private Label restContact;

    @FXML
    private ImageView restImage;

    @FXML
    private Label restName;


    public void setData(Restaurant restaurant) {
        restName.setText(restaurant.getNameRes());
        restContact.setText(restaurant.getContactInfo());
        restAddress.setText(restaurant.getAddressRes());
        ratingText.setText(String.format("%.1f", restaurant.getRating()));
    }

}
