package app_interface;

import app_system.orders.DebitCardPayment;
import app_system.orders.PaymentProcessor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class DebitCardController {

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
    private void handleConfirm() throws IOException {
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

        DebitCardPayment payment = new DebitCardPayment(
                5.5f,
                "Debit Card",
                transactionID,
                cardNumberText,
                cardHolderNameText,
                expiryDateText,
                cvvText
        );


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


            OrdersScene();
        }
    }


    private void OrdersScene() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/app_interface/Ordering/orders.fxml"));


        Stage stage = (Stage) cardNumber.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void handleBack() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("payment/payment.fxml"));
        Stage stage = (Stage) cardNumber.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

