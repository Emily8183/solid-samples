package tax_calculator;

public class Main {
    public static void main(String[] args) {
        Order new_order = new Order(100);

        TaxCalculator localTaxCalculator = new LocalTaxCalculator();

        OrderProcessor localOrderProcessor = new OrderProcessor(localTaxCalculator);

        localOrderProcessor.getTaxResult(new_order);

        TaxCalculator internationalTaxCalculator = new InternationalTaxCalculator();

        OrderProcessor internationalOrderProcessor = new OrderProcessor(internationalTaxCalculator);

        internationalOrderProcessor.getTaxResult(new_order);

    }

}
