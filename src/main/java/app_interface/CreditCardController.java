package app_interface;

import app_system.orders.CreditCardPayment;
import app_system.orders.PaymentProcessor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class CreditCardController {

    @FXML
    private TextField cardNumber;

    @FXML
    private TextField cardHolderName;

    @FXML
    private PasswordField cvv;

    @FXML
    private DatePicker expiryDate;

    @FXML
    private Label errorMessage;  // To show error message.

    @FXML
    private void handleConfirm() {
        String cardNumberText = cardNumber.getText();
        String cardHolderNameText = cardHolderName.getText();
        String cvvText = cvv.getText();
        String expiryDateText = expiryDate.getValue() != null ? expiryDate.getValue().toString() : "";

        int transactionID = new Random().nextInt(100000);
        CreditCardPayment payment = new CreditCardPayment(
                0.0,
                "Credit Card",
                transactionID,
                cardNumberText,
                cardHolderNameText,
                expiryDateText,
                cvvText
        );
        // to make Data validation.
        if (!payment.processPayment()) {
            errorMessage.setText("Error in card data! Please check the input.");
            errorMessage.setStyle("-fx-text-fill: red;");
        } else {
            errorMessage.setText("Processing completed successfully.");
            errorMessage.setStyle("-fx-text-fill: green;");
        }
    }

    @FXML
    private void handleBack() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("payment/Payment.fxml"));
        Stage stage = (Stage) cardNumber.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}


