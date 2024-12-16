package app_interface;


import app_system.accounts.AccountsManager;
import app_system.accounts.Admin;
import app_system.accounts.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button loginButton;

    public void TYPE() {
        System.out.println("I NEED HELP!!!!! HELP ME!!!!");
    }

    public void switchToSignUpPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) ( ((Node)event.getSource()) .getScene().getWindow() );
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("signup_portal.fxml")));
        stage.setScene(scene);
        stage.show();
    }

    public void login(ActionEvent event) throws IOException {
        boolean authorized = false;
        for (User usr: AccountsManager.getUsers() ) {
            if (emailField.getText().equals(usr.getEmail()) && passwordField.getText().equals(usr.getPassword())) {
                authorized = true;
                //switch scene
                FXMLLoader loader = new FXMLLoader(getClass().getResource("restaurant_view/restaurant_view.fxml"));
                Parent pane = loader.load();
                restaurant_viewController controller = loader.getController();
                controller.setCurrentUser(usr);


                Scene scn = new Scene(pane);
                Stage stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stg.setScene(scn);
                stg.show();
                break;

            }
        }

        for (Admin adm: AccountsManager.getAdmins() ) {
            if (emailField.getText().equals(adm.getEmail()) && passwordField.getText().equals(adm.getPassword())) {
                System.out.println(adm.getEmail());
                System.out.println(emailField.getText());
                authorized = true;
                //switch scene
                Parent pane = FXMLLoader.load(getClass().getResource("adm/admin_dashboard.fxml"));
                Scene scn = new Scene(pane);
                Stage stg = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stg.setScene(scn);
                stg.show();
                break;
            }
        }

        if (!authorized) {
            System.out.println("FAILED!!!");
        }
    }
}
