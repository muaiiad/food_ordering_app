package app_interface;

import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class restaurant_viewController {
    @FXML
    Button under10$Btn;
    @FXML
    Button over4starBtn;
    @FXML
    ComboBox priceBtn;
    @FXML
    Button resetBtn;
    @FXML
    Label numOfResult;
    @FXML
    GridPane gridres;
    @FXML
    public void initialize() throws IOException {

        for(Restaurant name:RestaurantManager.getRestaurants() ){
            additem(name);
        }
    }

    public void restaurant_view() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("restaurant_view.fxml"));
        Parent root = loader.load();
    }
    private int counterx;
    private int countery;

    public void additem(Restaurant res)throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("item_view.fxml"));
            AnchorPane item = loader.load();
            item_viewCotroller controller = loader.getController();
            controller.setdata(res);
            if (counterx<2) {
                counterx = 0;
                countery++;
            }
            gridres.add(item,counterx,countery);

    }


}

