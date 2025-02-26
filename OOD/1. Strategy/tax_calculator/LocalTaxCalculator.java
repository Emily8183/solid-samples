package tax_calculator;

public class LocalTaxCalculator implements TaxCalculator{

    public final double LOCAL_RATE = 0.1;

    @Override
    public double calculate(double amount) {
        return amount * LOCAL_RATE;
    }

    @Override
    public String getTaxType() {
        return "Local Tax";
    }

   

}
