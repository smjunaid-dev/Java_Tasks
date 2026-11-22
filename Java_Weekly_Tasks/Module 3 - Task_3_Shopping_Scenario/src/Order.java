public class Order {
    private final int orderId;
    private final String customerName;
    private final String productName;
    private final String category;
    private final String city;
    private final int quantity;
    private final double totalAmount;

    public Order(int orderId, String customerName, String productName,
                 String category, String city, int quantity,
                 double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.category = category;
        this.city = city;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String getCity() {
        return city;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return String.format(
            "Order ID: %d | Customer: %s | Product: %s | Category: %s | City: %s | Quantity: %d | Amount: %.2f",
            orderId, customerName, productName, category, city,
            quantity, totalAmount
        );
    }
}
