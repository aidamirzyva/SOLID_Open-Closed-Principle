package solid;

public class BitcoinPayment implements PaymentMethod {
    private String walletId;

    public BitcoinPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}
