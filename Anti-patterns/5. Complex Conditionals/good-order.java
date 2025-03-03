// GOOD

class OrderValidator {
  
    public boolean canProcess(Order order) {
      return isNew(order) && 
        meetMinimum(order) &&
        isNotProcessed(order) &&
        isActive(order) &&
        validPaymentMethod(order);
    }

    private boolean isNew(Order order) {
      return order.getStatus().equals("NEW");
    }

    private boolean meetMinimum(Order order) {
      return order.getTotal() > 100;
    }

    private boolean isNotProcessed(Order order) {
      return order.getStatus().equals("PROCESSED");
    }

    private boolean isActive(Order order) {
      return order.getActive();
    }

    private boolean validPaymentMethod(Order order) {
      return order.getPayment() != null;
    }
}