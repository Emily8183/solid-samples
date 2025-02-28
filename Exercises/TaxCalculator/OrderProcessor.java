package TaxCalculator;

import tax_calculator.LocalTaxCalculator;

//Problems: 1) Tightly coupled to LocalTaxCalculator; 2) Violation of Dependency Inversion Principle (DIP)

public class OrderProcessor {
     private LocalTaxCalculator taxCalculator = new LocalTaxCalculator(); // Tightly coupled!

    public void processOrder(double amount) {
        double tax = taxCalculator.calculateTax(amount);
        System.out.println("Total Amount: " + (amount + tax));
    }

}
