package tax_calculator;

//interface TaxCalculator, 任何税计算器都可以实现这个接口
public interface TaxCalculator {
    double calculate(double amount);
    String getTaxType(); 
 
}
