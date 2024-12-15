package app_interface;

import app_system.orders.DigitalWalletPayment;
import app_system.orders.PaymentProcessor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DigitalWalletController {

    @FXML
    public Button confirmButton;
    @FXML
    private TextField walletIDField;

    @FXML
    private TextField walletProviderField;

    @FXML
    private Button backButton;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleConfirm(ActionEvent event) {
        String walletID = walletIDField.getText().trim();
        String walletProvider = walletProviderField.getText().trim();

        if (walletID.isEmpty() || walletProvider.isEmpty()) {
            showMessage("Please fill in all fields.", "red");
            return;
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        int transactionID = paymentProcessor.generateTransactionID();
//        double amount = paymentProcessor.calculateAmount(selectedItem);
        double amount = 100.0;

        DigitalWalletPayment payment = new DigitalWalletPayment(
                amount, "Digital Wallet", transactionID, walletProvider, walletID
        );

        if (payment.processPayment()) {
            showMessage("Payment Completed Successfully! Transaction ID: " + transactionID, "green");
            walletIDField.clear();
            walletProviderField.clear();
        } else {
            showMessage("Invalid Wallet Provider or Wallet ID.", "red");
        }
    }

    // Method to show messages in the label
    private void showMessage(String message, String color) {
        messageLabel.setText(message);
        messageLabel.setStyle("-fx-text-fill: " + color + ";");
    }

    // Method to handle Back button click
    @FXML
    private void handleBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("payment/payment.fxml"));
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Payment");
        stage.show();
    }
}
