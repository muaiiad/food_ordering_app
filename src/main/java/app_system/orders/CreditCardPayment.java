package app_system.orders;

    public class CreditCardPayment extends Payment {

        private String cardNumber;
        private String cardHolderName;
        private String expiryDate;
        private String cvv;


        public CreditCardPayment(double amount, String paymentMethod, int transactionID,
                                 String cardNumber, String cardHolderName, String expiryDate, String cvv) {
            super(amount, "Credit Card", transactionID);
            this.cardNumber = cardNumber;
            this.cardHolderName = cardHolderName;
            this.expiryDate = expiryDate;
            this.cvv = cvv;
        }

        @Override
        public boolean processPayment() {

            if (cardNumber.length() == 16 && cvv.length() == 3) {
                setPaymentStatus("Completed");
                System.out.println("Payment with Credit Card processed successfully.");
                return true;
            } else {
                setPaymentStatus("Failed");
                System.out.println("Payment with Credit Card failed.");
                return false;
            }
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getCardHolderName() {
            return cardHolderName;
        }

        public void setCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getCvv() {
            return cvv;
        }

        public void setCvv(String cvv) {
            this.cvv = cvv;
        }
    }

