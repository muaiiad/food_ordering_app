package app_interface;

import app_system.restaurants.Menu;
import app_system.restaurants.Menu_Item;
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
import java.util.stream.Collectors;

public class RestaurantDashboardController {

    @FXML
    private Button addRestBtn;

    @FXML
    private VBox restaurantList;

    @FXML
    private VBox menuList;

    @FXML
    public void initialize() throws IOException {
        refreshResList();
        refreshMenuList();
    }

    private int selectedRestaurantIndex = 0;

    public void deselectAll() {
        restaurantList.getChildren().forEach(item -> item.getStyleClass().removeIf(style -> style.equals("selected-res")));
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

    public void refreshMenuList() throws IOException {
        menuList.getChildren().clear();
        int idx = 0;
        for (Menu_Item item: RestaurantManager.getRestaurants().get(selectedRestaurantIndex).getMenu().getItems()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_dashboard_item.fxml"));
            AnchorPane listElement = loader.load();
            DashboardItemController controller = loader.getController();
            controller.setParentController(this);
            controller.setData(item);
            controller.setCurrentIndex(idx++);
            controller.setRestaurantIndex(selectedRestaurantIndex);
            menuList.getChildren().add(listElement);
            menuList.getChildren().add(new Separator());

        }
    }


    public void setSelectedRestaurant(int selectedRestaurantIndex) {
        this.selectedRestaurantIndex = selectedRestaurantIndex;
    }

    public int getSelectedRestaurantIndex() {
        return selectedRestaurantIndex;
    }

    public void showAddResDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_dashboard_form.fxml"));
        Parent root = loader.load();

        RestaurantDashboardFormController cont = loader.getController();
        cont.setParentController(this);

        Stage stg = new Stage();
        cont.setParentStage(stg);
        Scene scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

    }

    public void showAddMenuDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_dashboard_form.fxml"));
        Parent root = loader.load();

        MenuDashboardFormController cont = loader.getController();
        cont.setParentController(this);
        Stage stg = new Stage();
        cont.setParentStage(stg);
        Scene scene = new Scene(root);
        stg.setScene(scene);
        stg.show();

    }
}
