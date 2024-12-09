package app_interface;

import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RestaurantDashboardItemController{

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

    private int currentIndex;

    private RestaurantDashboardController parentController;

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public void setParentController(RestaurantDashboardController parentController) {
        this.parentController = parentController;
    }

    @FXML
    private void initialize() {

    }


    public void removeRestaurant() throws IOException {
        RestaurantManager.getRestaurants().remove(currentIndex);
        parentController.refreshResList();
    }

    public void setData(Restaurant restaurant) {
        restName.setText(restaurant.getNameRes());
        restContact.setText(restaurant.getContactInfo());
        restAddress.setText(restaurant.getAddressRes());
        ratingText.setText(String.format("%.1f", restaurant.getRating()));
//        restImage.setImage(new Image(restaurant.getImgFile().toURI().toString()));
    }

}