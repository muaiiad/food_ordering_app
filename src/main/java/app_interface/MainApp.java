package app_interface;


import app_system.accounts.Account;
import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
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
        Parent root = FXMLLoader.load(getClass().getResource("admin_dashboard.fxml"));
        Scene scene = new Scene(root);
        String css = getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(css);
        //hello
        //123
        stage.setTitle("Food Ordering App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
//        FileManager.readIntoAdmins();
//
//        for (Admin adm: AccountsManager.getAdmins()) {
//            System.out.println(adm.getEmail());
//        }
    }
}