package app_interface;


import app_system.accounts.AccountsManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

    public void switchToSignUpPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) ( ((Node)event.getSource()) .getScene().getWindow() );
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("signup_portal.fxml")));
        stage.setScene(scene);
        stage.show();
    }

    public void login() {
        AccountsManager.getUsers();
    }
}
