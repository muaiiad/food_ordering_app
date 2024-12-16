package app_interface;

import app_system.orders.Order;
import app_system.orders.Cart_Item;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OrderTrackingController {
    @FXML
    private Label addressValue;
    @FXML
    private Label restaurantValue;
    @FXML
    private Label totalPriceValue;
    @FXML
    private Label statusValue;

// function to display order tracking
    public void orderTracking(Order order) {
        // تحديث القيم في الـ FXML باستخدام بيانات الـ Order
        addressValue.setText(order.getDeliveryAddress());
        restaurantValue.setText(order.getRestaurant().getNameRes());  // الحصول على اسم المطعم من الـ Restaurant
        totalPriceValue.setText("$" + calculateTotalPrice(order));
        statusValue.setText(order.getOrderStatus());
    }

    private double calculateTotalPrice(Order order) {
        double total = 0;
        for (Cart_Item item : order.getOrder_items()) {
            total += item.getMenu_item().getPrice() * item.getQuantity();
        }
        return total;
    }
}




