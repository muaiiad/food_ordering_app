package app_interface;

import app_system.accounts.AccountsManager;
import app_system.accounts.User;
import app_system.orders.Cart_Item;
import app_system.orders.Order;
import app_system.orders.Payment;
import app_system.restaurants.Restaurant;
import app_system.restaurants.RestaurantManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class OrdersController {

    @FXML
    private TextField addressField, timeField;

    @FXML
    private Button next;


    @FXML
    private void OrderSave(ActionEvent event) throws IOException {

        String address = addressField.getText();
        String deliveryTime = timeField.getText();


        if (address.isEmpty() || deliveryTime.isEmpty()) {

            System.out.println("Error, please enter data");
            return;
        }

        Order order_item=new Order(address,deliveryTime);
       order_item.setOrder_items(AccountsManager.getUsers().get(0).getCart().getItems());
        order_item.setCustomer(AccountsManager.getUsers().get(0));
        order_item.setRestaurant(RestaurantManager.getRestaurants().get(0));
       //order_item.setPayment_info(Payment.getPaymentMethod().get(0)); GIVING AN ERROR



        Parent root = FXMLLoader.load(getClass().getResource("Ordering/OrderCompleted.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }
}
