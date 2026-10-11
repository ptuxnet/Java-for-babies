package OOPS.Classes_And_Objects;

// Constructor chaining example
class Order {

    String customerName;
    double amount;
    String paymentMethod;

    // 1. Default order
    Order() {
        this("Unknown", 0, "Cash");
    }

    // 2. Customer name only
    Order(String customerName) {
        this(customerName, 0, "Cash");
    }

    // 3. Customer + amount
    Order(String customerName, double amount) {
        this(customerName, amount, "Cash");
    }

    // 4. Complete constructor
    Order(String customerName, double amount, String paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }
}