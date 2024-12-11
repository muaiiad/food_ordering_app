package app_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentController {

    @FXML
    private ToggleGroup paymentMethod;  // للتأكد من أن هناك اختيارات بين طرق الدفع

    // التنقل إلى الواجهة المناسبة
    @FXML
    public void handleNextButton(ActionEvent event) throws IOException {
        String selectedPayment = ((RadioButton) paymentMethod.getSelectedToggle()).getText();
        String fxmlFile = "";

        switch (selectedPayment.toLowerCase()) {
            case "credit card":
                fxmlFile = "/app_interface/CreditCardPayment.fxml";  // استخدم المسار الكامل
                break;
            case "debit card":
                fxmlFile = "/app_interface/DebitCardPayment.fxml";  // استخدم المسار الكامل
                break;
            case "digital wallet":
                fxmlFile = "/app_interface/DigitalWalletPayment.fxml";  // استخدم المسار الكامل
                break;
            default:
                System.out.println("No payment method selected.");
                return;
        }

        // تحميل الـ FXML الجديد
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();  // طباعة الاستثناء لمساعدتك في تحديد المشكلة
        }
    }
}

