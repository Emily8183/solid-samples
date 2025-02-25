package tax_calculator;

public class InternationalTaxCalculator implements TaxCalculator{

    public static final double INTERNATIONAL_TAX_RATE = 0.20;

    @Override
    public double calculatorTax(double amount) {
        return amount * INTERNATIONAL_TAX_RATE; // 国际税 20%
    }

    @Override
    public String getTaxType() {
        return "International Tax";
    }

}
