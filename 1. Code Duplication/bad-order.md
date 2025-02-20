**BAD**
Duplicate code in multiple classes

class CustomerOrder {
    void processOrder() {
        validateCustomer();
        calculateTotal();
        applyDiscount();
        saveToDatabase();
    }
}
class SupplierOrder {
    void processOrder() {
        validateCustomer(); // Same code duplicated
        calculateTotal();   // Same code duplicated
        applyDiscount();   // Same code duplicated
        saveToDatabase();  // Same code duplicated
    }
}