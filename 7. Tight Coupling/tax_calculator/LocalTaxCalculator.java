package tax_calculator;

public class LocalTaxCalculator implements TaxCalculator{

    private static final double LOCAL_TAX_RATE = 0.14;

    @Override
    public double calculatorTax(double amount) { //method name must match the interface's method name
        return amount * LOCAL_TAX_RATE;
    }

    @Override
    public String getTaxType() {
        return "Local Tax";
    }

}
