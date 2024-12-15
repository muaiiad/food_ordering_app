package app_interface;


import app_system.accounts.Account;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import app_system.accounts.User;
import app_system.filemanager.FileManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("menu_view.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("Food Ordering App");
        stage.setScene(scene);//
        stage.show();
    }

    public static void main(String[] args) {
        FileManager.readFiles();
        for (User usr: AccountsManager.getUsers()) {
            System.out.println(usr.getUsername());
        }
        launch(args);

    }
}