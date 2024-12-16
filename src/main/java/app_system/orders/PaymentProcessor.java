package app_system.orders;
//import app_system.restaurants.Menu_Item;
import java.util.Random;

public class PaymentProcessor {

//    public double calculateAmount(Menu_Item selectedItem) {
//        if (selectedItem != null) {
//            double amount = selectedItem.getPrice();
//            System.out.println("Amount calculated: $" + amount);
//            return amount;
//        } else {
//            System.out.println("Item not found.");
//            return 0.0;
//        }
//    }
    private double calculateAmount(Order order) {
        double amount = 0;
        for (Cart_Item item : order.getOrder_items()) {
            amount += item.getMenu_item().getPrice() * item.getQuantity();
        }
        return amount;
    }
    public int generateTransactionID() {
        int transactionID = new Random().nextInt(100000);
        System.out.println("Payment process Transaction ID: " + transactionID);
        return transactionID;
    }
}

