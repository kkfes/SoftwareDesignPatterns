package week3;

public class ECommerceApp {
    private final PaymentProcessor paymentProcessor;

    public ECommerceApp(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        System.out.println("Processing payment of $" + amount);
        paymentProcessor.pay(amount);
    }

    public static void main(String[] args) {
        OldBankApi legacyApi = new OldBankApi();
        PaymentProcessor adapter = new BankApiAdapter(legacyApi);

        ECommerceApp app = new ECommerceApp(adapter);
        app.checkout(49.99);
    }
}