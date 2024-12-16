package app_system.orders;

public abstract class Payment {

    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private int transactionID;

    public Payment(double amount, String paymentMethod , int transactionID) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pending";
        this.transactionID = transactionID;
    }

    public abstract boolean processPayment();

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
}

