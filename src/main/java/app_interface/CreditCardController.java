package app_interface;

import app_system.orders.CreditCardPayment;
import app_system.orders.PaymentProcessor;
import app_system.restaurants.Menu_Item;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

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

        if (cardNumberText.isEmpty() || cardHolderNameText.isEmpty() || cvvText.isEmpty() || expiryDateText == null) {
            errorMessage.setText("Please fill all the fields.");
            return;
        }

        PaymentProcessor paymentProcessor = new PaymentProcessor();
//        double amount = paymentProcessor.calculateAmount(selectedItem);
        int transactionID = paymentProcessor.generateTransactionID();

        CreditCardPayment payment = new CreditCardPayment(
                5.5f,
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
            cardNumber.clear();
            cardHolderName.clear();
            cvv.clear();
            expiryDate.setValue(null);
        }
    }

    @FXML
    private void handleBack() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("payment/payment.fxml"));
        Stage stage = (Stage) cardNumber.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}


