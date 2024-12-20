package app_interface;

import app_system.accounts.AccountsManager;
import app_system.accounts.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupController {

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField usernameField;

    public void switchToLoginPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) ( ((Node)event.getSource()) .getScene().getWindow() );
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("login_portal.fxml")));
        stage.setScene(scene);
        stage.show();
    }

    public void registerNewUser() {
        AccountsManager.getUsers().add(new User(emailField.getText(), usernameField.getText(), passwordField.getText()));
        emailField.setText("");
        usernameField.setText("");
        passwordField.setText("");
    }

}
