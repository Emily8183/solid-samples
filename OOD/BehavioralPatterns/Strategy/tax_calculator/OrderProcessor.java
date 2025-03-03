package tax_calculator;

public class OrderProcessor {
   
    private TaxCalculator taxCalculator;

    public OrderProcessor(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void getTaxResult(Order order) {
       double orderAmount = order.getAmount();
       double taxAmount = taxCalculator.calculate(orderAmount);

       System.out.println("while the order amount is " + orderAmount + ","
                         + "and the tax type is " + taxCalculator.getTaxType() + " , the tax amount is " + taxAmount);
       
    }
    

}
