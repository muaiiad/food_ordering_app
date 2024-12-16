package app_interface;


import app_system.accounts.Account;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import app_system.accounts.User;
import app_system.filemanager.FileManager;
import app_system.orders.Cart;
import app_system.orders.Cart_Item;
import app_system.restaurants.Menu;
import app_system.restaurants.Menu_Item;
import app_system.restaurants.RestaurantManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("menu_view.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Cart/MainCheckout.fxml"));
        Parent root = loader.load();

        for (Menu_Item mn: RestaurantManager.getRestaurants().get(0).getMenu().getItems()) {
            AccountsManager.getUsers().get(0).getCart().getItems().add(new Cart_Item(mn,1));
        }



        Scene scene = new Scene(root);
        stage.setTitle("Food Ordering App");
        stage.setScene(scene);//
        stage.show();
    }
    public static void main(String[] args) {
        FileManager.readFiles();
        launch(args);

//        for (Admin adm: AccountsManager.getAdmins()) {
//            System.out.println(adm.getEmail());
//        }
    }
}