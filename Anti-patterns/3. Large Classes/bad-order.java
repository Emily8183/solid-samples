// BAD
// Single class with too many responsibilities

class OrderManager {
    // Order processing
    void processOrder() {}
    void validateOrder() {}
    void calculateTotal() {}
    
    // Database operations
    void saveOrder() {}
    void loadOrder() {}
    void deleteOrder() {}
    
    // Email notifications
    void sendConfirmation() {}
    void sendShippingUpdate() {}
    
    // Payment processing
    void processPayment() {}
    void refundPayment() {}
}