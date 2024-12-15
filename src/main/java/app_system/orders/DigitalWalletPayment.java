package app_system.orders;

public class DigitalWalletPayment extends Payment {

    private String walletProvider;
    private String walletID;

    public DigitalWalletPayment(double amount, String paymentMethod, int transactionID, String walletProvider, String walletID) {
        super(amount, "Digital Wallet", transactionID);
        this.walletProvider = walletProvider;
        this.walletID = walletID;
    }

    @Override
    public boolean processPayment() {

        if (walletID.contains("@")) {
            if (walletProvider.equalsIgnoreCase("PayPal") || walletProvider.equalsIgnoreCase("Google Pay")) {
                setPaymentStatus("Completed");
                System.out.println("Payment Successful! Transaction ID: " + getTransactionID());
                return true;
            } else {
                setPaymentStatus("Failed");
                System.out.println("Payment Failed! Invalid Wallet Provider.");
                return false;
            }
        } else {
            setPaymentStatus("Failed");
            System.out.println("Payment Failed! Invalid Wallet ID.");
            return false;
        }
    }

    public String getWalletProvider() {
        return walletProvider;
    }

    public void setWalletProvider(String walletProvider) {
        this.walletProvider = walletProvider;
    }

    public String getWalletID() {
        return walletID;
    }

    public void setWalletID(String walletID) {
        this.walletID = walletID;
    }
}


