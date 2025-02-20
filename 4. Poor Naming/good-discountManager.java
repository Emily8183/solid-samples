**GOOD**

class DiscountManager {
    void processOrders(List<Order> orderList) {
        for(Order order : orderList) {
            double total = order.getPrice() * order.getQuantity();
        }
    }
}