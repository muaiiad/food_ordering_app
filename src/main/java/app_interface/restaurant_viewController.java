package app_interface;

import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Stop;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

import static java.util.stream.StreamSupport.stream;

public class restaurant_viewController {
    @FXML
    Button under10$Btn;
    @FXML
    Button over4starBtn;
    @FXML
    ComboBox priceBtn;
    @FXML
    TextField search;
    @FXML
    Button resetBtn;
    @FXML
    Label numOfResult;
    @FXML
    GridPane grid;

    @FXML
    public void initialize() throws IOException {

        for (Restaurant name : RestaurantManager.getRestaurants()) {
            additem(name);
        }
    }


    public void restaurant_view() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_view.fxml"));
        Parent root = loader.load();
    }

    private int counterx = 0;
    private int countery = 0;

    public void additem(Restaurant res) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("item_view.fxml"));
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
                        .filter(restaurant -> restaurant.getNameRes().toLowerCase().contains(lowerCaseQuery))
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




