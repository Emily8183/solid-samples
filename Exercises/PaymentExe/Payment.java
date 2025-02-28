//problems: 1) bad naming; 2) numbers; 3) against open-close principle, should use strategy pattern

public class Payment {
    public void process(double a, int t) {
        if (t == 1) {
            System.out.println("Processing credit card payment of $" + a * 0.98);
        } else if (t == 2) {
            System.out.println("Processing PayPal payment of $" + a * 0.97);
        } else {
            System.out.println("Invalid payment type.");
        }
    }
    
}
