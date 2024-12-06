package app_interface;

import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class RestaurantDashboardController {

    @FXML
    private Button addRestBtn;

    @FXML
    private VBox restaurantList;


    public void showAddResDialog() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_dashboard_form.fxml"));
        Parent root = loader.load();

        RestaurantDashboardFormController cont = new RestaurantDashboardFormController();

        cont = loader.getController();





        Stage stg = new Stage();
        cont.resList = restaurantList;
        cont.parentStage = stg;
        Scene scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

    }
}
