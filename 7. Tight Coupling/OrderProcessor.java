



//OrderProcessor 依赖的是 TaxCalculator 接口，而不是具体实现（如 LocalTaxCalculator）
public class OrderProcessor {
    private TaxCalculator taxCalculator;

    public OrderProcessor(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void processOrder(Order order) {
        // Order-processing logic.

        double tax = taxCalculator.calculateTax(order.getAmount());
    }
}

public class Order {
    private final double amount; //订单金额创建后不能改变

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class Main {
    
}



