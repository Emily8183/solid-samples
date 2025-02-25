package tax_calculator;

public class OrderProcessor {
    private TaxCalculator taxCalculator; //dependent upon abstraction


    public OrderProcessor(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void processOrder(Order order) {
        double orderAmount = order.getAmount();
        double tax = taxCalculator.calculatorTax(orderAmount);
        
        System.out.println(taxCalculator.getTaxType());
        System.out.println("Order amount: $" + orderAmount);
        System.out.println("Tax: $" + tax);
        System.out.println("Total amount: $" + (orderAmount + tax)); //这里需要加单独的括号

    }

}
