package app_interface;

import app_system.restaurants.Restaurant;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class RestaurantDashboardController {

    @FXML
    private Button addRestBtn;

    @FXML
    private VBox restaurantList;


    public void addRestaurant() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_dashboard_item.fxml"));
        try {
            AnchorPane item = loader.load();
            RestaurantDashboardItemController itemController = loader.getController();
            Restaurant restaurant = new Restaurant("Test Bakery","123 Street St.","19000");
            itemController.setData(restaurant);
            restaurantList.getChildren().add(item);
        } catch (IOException e) {
            e.printStackTrace();
        }





        //
    }
}
