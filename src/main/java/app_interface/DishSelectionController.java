package app_interface;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

    public class DishSelectionController {

        @FXML
        private Button itemPrice;
        @FXML
        private Label itemDis;
        @FXML
        private Label itemName;
        public void initialize ()
        {
            setLabel();
        }

        public void setLabel ()
        {
            itemName.setText(app_system.restaurants.RestaurantManager.getRestaurants().get(0).getMenu().getItems().get(0).getName());
            itemDis.setText(app_system.restaurants.RestaurantManager.getRestaurants().get(0).getMenu().getItems().get(0).getDescription());
            itemPrice.setText("Make 1 required selection -$"+app_system.restaurants.RestaurantManager.getRestaurants().get(0).getMenu().getItems().get(0).getPrice());
        }

    }

