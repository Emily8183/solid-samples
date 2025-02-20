**BAD**

if(order.getStatus().equals("NEW") && 
   order.getTotal() > 100 && 
   !order.isProcessed() && 
   order.getCustomer().isActive() && 
   order.getPaymentMethod() != null) {
    // process order
}