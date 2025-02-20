**GOOD**
1) Extract duplicate code into reusable methods or classes
2) Apply the DRY (Don't Repeat Yourself) principle



<!-- OR: abstract class Order -->
class Order {
    void processOrder() {
        validateCustomer();
        calculateTotal();
        applyDiscount();
        saveToDatabase();
    }
}

class SupplierOrder extends Order {};
class CustomerOrder extends Order {};
