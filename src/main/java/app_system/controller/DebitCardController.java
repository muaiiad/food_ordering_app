package app_system.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class DebitCardController {

    @FXML
    private TextField cardNumber;
    @FXML
    private TextField cardHolder;
    @FXML
    private TextField expiryDate;
    @FXML
    private PasswordField cvv;

    @FXML
    private void handleCompletePayment() {
        if (cardNumber.getText().isEmpty() || cardHolder.getText().isEmpty() || expiryDate.getText().isEmpty() || cvv.getText().isEmpty()) {
            showAlert("Error", "All fields must be filled!");
        } else {
            showAlert("Success", "Payment processed successfully with Debit Card!");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

