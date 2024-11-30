package app_interface;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private TextField text1;
    @FXML
    private Button printButton;

    public void onButtonPress() {
            System.out.println(text1.getText());
    }
}
