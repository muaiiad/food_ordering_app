package app_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupController {

    public void switchToLoginPage(ActionEvent event) throws IOException {
        Stage stage = (Stage) ( ((Node)event.getSource()) .getScene().getWindow() );
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("login_portal.fxml")));
        stage.setScene(scene);
        stage.show();
    }

}
