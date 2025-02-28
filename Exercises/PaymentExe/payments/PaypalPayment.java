package PaymentExe.payments;

public class PaypalPayment implements Payment{
    private final static double PAYPAL_DISCOUNT_RATE = 0.97;

    @Override
    public void runPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount * PAYPAL_DISCOUNT_RATE);
    }

}
