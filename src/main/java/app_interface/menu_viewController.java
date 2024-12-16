package app_interface;
import app_system.accounts.Account;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import app_system.filemanager.FileManager;
import app_system.restaurants.Menu_Item;
 import app_system.restaurants.Restaurant;
 import app_system.restaurants.RestaurantManager;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



import java.io.IOException;
public class menu_viewController {
    @FXML
    private GridPane grid;
    private int CurrentX;
    private int CurrentY;
    @FXML
    private Label nameOFres;
    @FXML
    private Label rating;

    @FXML
    public void initialize() throws IOException {
        addTOgrid();
        setData();
    }

    @FXML
    void addTOgrid() throws IOException {
        for (Menu_Item item : app_system.restaurants.RestaurantManager.getRestaurants().get(0).getMenu().getItems()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu_item.fxml"));
            VBox MYbox = loader.load();
            Menu_itemController controller = loader.getController();

            if (CurrentX >2) {
                CurrentX = 0;
                CurrentY++;
            }

            controller.setLabel(item.getName(), item.getDescription(), item.getPrice());
            grid.add(MYbox, CurrentX++, CurrentY);


        }


    }
    public void setData()
    {
        nameOFres.setText(app_system.restaurants.RestaurantManager.getRestaurants().get(0).getNameRes());
        rating.setText(String.format("%.1f",app_system.restaurants.RestaurantManager.getRestaurants().get(0).getRating()));
    }
}


