package app_interface;

import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class RestaurantDashboardController {

    @FXML
    private Button addRestBtn;

    @FXML
    private VBox restaurantList;

    @FXML
    public void initialize() throws IOException {
        refreshResList();
    }

    public void refreshResList() throws IOException {
        restaurantList.getChildren().clear();
        int idx = 0;
        for (Restaurant res: RestaurantManager.getRestaurants()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("restaurant_dashboard_item.fxml"));
            AnchorPane item = loader.load();
            RestaurantDashboardItemController itemController = loader.getController();
            itemController.setCurrentIndex(idx++);
            itemController.setData(res);
            itemController.setParentController(this);
            restaurantList.getChildren().add(item);
            restaurantList.getChildren().add(new Separator());
        }
    }


    public void showAddResDialog() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_dashboard_form.fxml"));
        Parent root = loader.load();

        RestaurantDashboardFormController cont = new RestaurantDashboardFormController();


        cont = loader.getController();
        cont.setParentController(this);

        Stage stg = new Stage();
        cont.resList = restaurantList;
        cont.parentStage = stg;
        Scene scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

    }
}
