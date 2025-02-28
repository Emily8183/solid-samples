package PaymentExe.payments;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input an amount: ");

        double amount = scanner.nextDouble();
    
        System.out.println("Select payment type: 1 for Credit Card, 2 for PayPal");

        int userInput = scanner.nextInt();

        Payment payment;

        if (userInput == 1) {
            payment = new CreditCardPayment();
        } else if (userInput == 2) {
            payment = new PaypalPayment();
        } else {
            System.out.println("invalid numberr");
            return;
        }

        PaymentProcessor processor = new PaymentProcessor(payment);

        Order order = new Order(amount);

        processor.processor(order);

        scanner.close();
        
    }
    





}
