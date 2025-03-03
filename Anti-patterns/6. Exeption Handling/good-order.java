try {
    processOrder();
} catch(OrderValidationException e) {
    logger.error("Order validation failed", e);
    throw new BusinessException("Unable to process order", e);
} catch(PaymentException e) {
    logger.error("Payment processing failed", e);
    notifyPaymentTeam(e);
    throw new BusinessException("Payment failed", e);
}
