// GOOD

public class OrderConstants {
    public static final int STATUS_NEW = 1;
    public static final double MIN_DISCOUNT_AMOUNT = 100.0;
    public static final double STANDARD_DISCOUNT = 0.1;
}

if(order.getStatus() == OrderConstants.STATUS_NEW) {
    if(order.getTotal() > OrderConstants.MIN_DISCOUNT_AMOUNT) {
        order.setDiscount(OrderConstants.STANDARD_DISCOUNT);
    }
}

// Even better using enums
enum OrderStatus {
    NEW, PROCESSING, COMPLETED, CANCELLED
}
