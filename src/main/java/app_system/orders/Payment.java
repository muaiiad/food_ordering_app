package app_system.orders;

public class Payment {
    private String paymentMethod;
    private int transactionID;
    private String  paymentStatus;

    public Payment(String paymentMethod,int transactionID,String  paymentStatus){
        this.paymentMethod = paymentMethod;
        this.transactionID = transactionID;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void paymentProcessing(String method, int transactionId){
        if (method == null || method.isEmpty() || transactionId <= 0) {
            System.out.println("Invalid payment method or transaction ID.");
            this.paymentStatus = "Failed";
        }
        this.paymentMethod = method;
        this.transactionID = transactionId;
        this.paymentStatus = "Pending";

        System.out.println("Processing payment via " + paymentMethod);
    }

    public void displayPaymentDetails() {
        System.out.println("Payment Details:");
        System.out.println("*****************");
        System.out.println("     Method: " + paymentMethod);
        System.out.println("     Transaction ID: " + transactionID);
        System.out.println("     Status: " + paymentStatus);
    }
}
