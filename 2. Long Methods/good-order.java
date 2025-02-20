// GOOD
// 1) Break down long methods into smaller, more focused methods
// 2) Improve readability and maintainability
// 3) However, it remains the issue that the class being too large. Check out the Sample 3 for a better solution.

class OrderProcessor {
  
    void OrderProcessor(Order order) {
        validateOrder(order);
        double total = calculateTotals(order);
        applyDiscounts(total);
        saveOrder(order);
        notifyConsumer(order);
    }
    
    private void validateOrder(Order order) {
        // showing the specific error
        if(order.getCustomer() == null) throw new IllegalArgumentException("Customer cannot be null"); 
        if(!order.getCustomer().isActive()) throw new IllegalStateException("Customer must be active");
    }
    
    private double calculateTotal(Order order) {
        return order.getItems().stream()
            .mapToDouble(item -> item.getPrice() * item.getQuantity())
            .sum();
    }
    
    private void applyDiscounts(double total) {
        if(total > 100) total *= 0.9;
    }
    
    private void saveOrder(Order order) {
        connection.save(order);
    }
    
    private void notifyConsumer(Order order) {
        emailService.send(order);
    }

}
