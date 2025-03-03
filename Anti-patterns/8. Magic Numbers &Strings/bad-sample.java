//BAD

if(order.getStatus() == 1) {
    if(order.getTotal() > 100) {
        order.setDiscount(0.1);
    }
}
