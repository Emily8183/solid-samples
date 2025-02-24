//interface TaxCalculator, 任何税计算器都可以实现这个接口
public interface TaxCalculator {
    double calculatorTax(double amount);
}

//本地税计算器
public class LocalTaxCalculator implements TaxCalculator {
    public double calculatorTax(double amount) {
        return amount * 0.14;
    }
}

//新增国际税计算器
public class InternationalTaxCalculator implements TaxCalculator {
    public double calculateTax(double amount) {
        return amount * 0.20; // 国际税 20%
    }
}

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



