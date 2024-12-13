package app_interface;
import app_system.accounts.Account;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import app_system.filemanager.FileManager;
import app_system.restaurants.Menu_Item;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    void addTOgrid(ActionEvent event) throws IOException
    { FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu_item.fxml"));
        VBox MYbox = loader.load();
        Menu_itemController controller = loader.getController();

        if( CurrentX>1)
        {
            CurrentX=0;
            CurrentY++;
        }
        grid.add(MYbox,CurrentX++,CurrentY);

        for (Menu_Item item: app_system.restaurants.RestaurantManager.getRestaurants().get(0).getMenu().getItems())
        {
            controller.setLabel(item.getName(),item.getDescription(),item.getPrice());


        }


    }

}