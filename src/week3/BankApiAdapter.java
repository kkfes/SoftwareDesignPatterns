package week3;

public class BankApiAdapter implements PaymentProcessor {

    private final OldBankApi oldBankApi;

    public BankApiAdapter(OldBankApi oldBankApi) {
        this.oldBankApi = oldBankApi;
    }

    @Override
    public void pay(double amount) {
        int cents = (int) (amount * 100);
        oldBankApi.makeTransaction(cents);
    }
}