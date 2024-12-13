package app_interface;

import app_system.orders.DigitalWalletPayment;
import app_system.orders.PaymentProcessor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class DigitalWalletController {

    public Button confirmButton;
    @FXML
    private TextField walletIDField;

    @FXML
    private TextField walletProviderField;

    @FXML
    private Button backButton;

    @FXML
    private void handleConfirm(ActionEvent event) {
        String walletID = walletIDField.getText().trim();
        String walletProvider = walletProviderField.getText().trim();

        if (walletID.isEmpty() || walletProvider.isEmpty()) {
            showAlert("Error", "Please fill in all fields.", Alert.AlertType.ERROR);
            return;
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor();
//        double amount = paymentProcessor.calculateAmount(selectedItem);
        double amount = 100.0;
        int transactionID = paymentProcessor.generateTransactionID();

        DigitalWalletPayment payment = new DigitalWalletPayment(
                amount,
                "Digital Wallet",
                transactionID,
                walletProvider,
                walletID
        );

        if (payment.processPayment()) {
            showAlert("Success", "Payment Completed Successfully!\nTransaction ID: "
                    + transactionID + "\nPrice: $" + amount, Alert.AlertType.INFORMATION);
        } else {
            showAlert("Payment Failed", "Invalid Wallet Provider or Wallet ID.", Alert.AlertType.ERROR);
        }
    }

    // Method to show alerts (Error, Information)
    private void showAlert(String title, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Method to handle Back button click
    @FXML
    private void handleBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Payment.fxml")); // Adjust path accordingly
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Payment");
        stage.show();
    }
}