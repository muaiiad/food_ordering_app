package app_system.orders;
import app_system.restaurants.Menu_Item;

import java.util.Random;

public class PaymentProcessor {

        private double amount;
        private int transactionID;

        public void calculateAmount(Menu_Item selectedItem) {
            if (selectedItem != null) {
                amount = selectedItem.getPrice();
                generateTransactionID();
                System.out.println("Amount calculated: $" + amount);
                System.out.println("Transaction ID: " + transactionID);
            } else {
                System.out.println("Item not found.");
            }
        }

        public void generateTransactionID() {
            Random random = new Random();
            transactionID = 100000 + random.nextInt(900000); // قيمة من 100000 إلى 999999
        }

        public double getAmount() {
            return amount;
        }

        public int getTransactionID() {
            return transactionID;
        }
}
