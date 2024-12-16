package app_interface;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import java.io.IOException;

public class DishSelectionController {












    @FXML
    private Button orderButton;
    @FXML
    private void goToPaymentPage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Payment.fxml"));
            Scene paymentScene = new Scene(loader.load());

            Stage stage = (Stage) orderButton.getScene().getWindow();
            stage.setScene(paymentScene);
            stage.setTitle("Payment Page");
            stage.show();
        } catch (IOException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Page Load Failed");
            alert.setContentText("Could not load the payment page.");
            alert.showAndWait();
        }
    }
}


