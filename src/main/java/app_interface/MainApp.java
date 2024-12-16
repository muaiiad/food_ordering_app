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
//        Parent root = FXMLLoader.load(getClass().getResource("menu_view.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_view.fxml"));
        Parent root = loader.load();




        menu_viewController controller=loader.getController();
        User user=new User("shroul@","shrouk","1233fvxz");
        User user2=new User("menna@","menna","1233fvxz");
        User user3=new User("mohamed@","mohamed","1233fvxz");
//        controller.setvalue(user.getUsername(),user.getUsername().split("")[0],"rest1","hello my new meal",4);
//        //123
//        controller.setvalue2(user2.getUsername(),user2.getUsername().split("")[0],"rest2","hello my new meal",5);
//        //123
//        controller.setvalue3(user3.getUsername(),user3.getUsername().split("")[0],"rest3","hello my new meal",3);
//        //123
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