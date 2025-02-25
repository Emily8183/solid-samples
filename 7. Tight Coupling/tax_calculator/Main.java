package tax_calculator;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(100);
        Order order2 = new Order(200);
 
        TaxCalculator locaTaxCalculator = new LocalTaxCalculator();
        OrderProcessor localOrderProcessor = new OrderProcessor(locaTaxCalculator);
        
        localOrderProcessor.processOrder(order1);

        TaxCalculator InternationalTaxCalculator = new InternationalTaxCalculator();
        OrderProcessor intenationalOrderProcessor = new OrderProcessor(InternationalTaxCalculator);
       

        intenationalOrderProcessor.processOrder(order2);

    }

}
