package notsolid;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
        }
        else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        }
    }

}
