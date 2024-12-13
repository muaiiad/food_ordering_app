package app_interface;

import app_system.restaurants.Menu_Item;
import app_system.restaurants.RestaurantManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardItemController {

    @FXML
    private Label itemDescription;

    @FXML
    private ImageView itemImage;

    @FXML
    private Label itemName;

    @FXML
    private Label priceText;

    @FXML
    private Label ratingText;

    @FXML
    private AnchorPane rootPane;

    private RestaurantDashboardController parentController;
    private int currentIndex;
    private int restaurantIndex;

    @FXML
    void removeItem(MouseEvent event) throws IOException {
        RestaurantManager.getRestaurants().get(restaurantIndex).getMenu().getItems().remove(currentIndex);
        parentController.refreshMenuList();
    }

    public void setParentController(RestaurantDashboardController parentController) {
        this.parentController = parentController;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public void setRestaurantIndex(int restaurantIndex) {
        this.restaurantIndex = restaurantIndex;
    }

    public void setData(Menu_Item item) {
        itemName.setText(item.getName());
        priceText.setText("$" + Float.toString(item.getPrice()));
        itemDescription.setText(item.getDescription());

    }

}
