package tax_calculator;

public class Order {
    private final double amount;//订单金额创建后不能改变

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
