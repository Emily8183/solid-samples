// **BAD**
// Single large method doing many things
// Tight coupling

class OrderProcessor {
    void processOrder(Order order) {
        // 100+ lines doing everything
        // Validate customer
        if(order.getCustomer() == null) throw new Exception();
        if(!order.getCustomer().isActive()) throw new Exception();
        
        // Calculate totals
        double total = 0;
        for(Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        
        // Apply discounts
        if(total > 100) total *= 0.9;
        
        // Save to database
        connection.save(order);
        
        // Send email
        emailService.send(order);
    }
}