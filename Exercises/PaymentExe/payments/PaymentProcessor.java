package PaymentExe.payments;

public class PaymentProcessor {
    Payment payment;

    //constructor for dependency injection
    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    // public void processor(double amount) { <== wrong!!
    //     payment.runPayment(amount);
    // }

    public void processor(Order order) {
        payment.runPayment(order.getAmount());
    }

}
