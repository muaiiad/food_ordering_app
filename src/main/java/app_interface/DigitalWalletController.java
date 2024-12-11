package app_interface;

import app_system.orders.DigitalWalletPayment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
//import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class DigitalWalletController {

    @FXML
    private TextField walletIDField;

    @FXML
    private TextField walletProviderField;

    private double amount = 100.0;

    @FXML
    private void handleConfirm(ActionEvent event) {
        String walletID = walletIDField.getText().trim();
        String walletProvider = walletProviderField.getText().trim();

        if (walletID.isEmpty() || walletProvider.isEmpty()) {
            showAlert("Error", "Please fill in all fields.", Alert.AlertType.ERROR);
            return;
        }

        int transactionID = new Random().nextInt(100000);

        // إنشاء كائن الدفع
        DigitalWalletPayment payment = new DigitalWalletPayment(
                amount,
                "Digital Wallet",
                transactionID,
                walletProvider,
                walletID
        );

        boolean success = payment.processPayment();

        if (success) {
            showAlert("Success", "Payment Completed Successfully!\nTransaction ID: "
                    + transactionID + "\nAmount: $" + amount, Alert.AlertType.INFORMATION);
        } else {
            showAlert("Payment Failed", "Invalid Wallet Provider or Wallet ID.", Alert.AlertType.ERROR);
        }
    }

    private void showAlert(String title, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private Button backButton;

    @FXML
    private void handleBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Payment.fxml"));
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Payment");
        stage.show();
    }
}



