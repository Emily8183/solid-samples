package PaymentExe.payments;

public class CreditCardPayment implements Payment{

    private static final double CC_DISCOUNT_RATE = 0.98;

    @Override
    public void runPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount * CC_DISCOUNT_RATE);
    }

}
