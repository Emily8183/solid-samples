package tax_calculator;

public class InternationalTaxCalculator implements TaxCalculator{

    public final double INTERNATIONAL_RATE = 0.2;

    @Override
    public double calculate(double amount) {
        return amount * INTERNATIONAL_RATE;
    }

    @Override
    public String getTaxType() {
        return "International Tax";
    }


}
