package app_interface;

import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import app_system.accounts.User;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class restaurant_viewController {
    @FXML
    ComboBox<String> priceBtn;
    @FXML
    TextField search;
    @FXML
    Button resetBtn;
    @FXML
    Label numOfResult;
    @FXML
    Label addressLabel;
    @FXML
    GridPane grid;
    @FXML
    ToggleButton over4Stars;


    User currentUser;



    @FXML
    public void initialize() throws IOException {
        numOfResult.setText(RestaurantManager.getRestaurants().size() + " results");
        priceBtn.setItems(FXCollections.observableArrayList("$","$$","$$$"));
        for (Restaurant name : RestaurantManager.getRestaurants()) {
            additem(name);
        }


    }


    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;

        addressLabel.setText(currentUser.getDeliveryAddress());
    }

    private int counterx = 0;
    private int countery = 0;

    public void additem(Restaurant res) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_view/item_view.fxml"));
        AnchorPane item = loader.load();
        item_viewCotroller controller = loader.getController();
        controller.setdata(res);
        if (counterx > 2) {
            counterx = 0;
            countery++;
        }
        grid.add(item, counterx++, countery);

    }

    public ArrayList<Restaurant> searchRestaurants(String search) {
        String lowerCaseQuery = search.toLowerCase();
        return
                (ArrayList<Restaurant>) RestaurantManager.getRestaurants().stream()
                        .filter(r -> r.getNameRes().toLowerCase().contains(lowerCaseQuery))
                        .filter(r -> r.getRating() > (over4Stars.isSelected() ? 4 : 0))
                        .collect(Collectors.toList());
    }

    public void search() throws IOException {
        String text = search.getText();
        ArrayList<Restaurant> result = searchRestaurants(text);
        grid.getChildren().clear();
        countery=0;
        counterx=0;
        for (Restaurant restaurant : result) {
            additem(restaurant);
        }
    }
}




