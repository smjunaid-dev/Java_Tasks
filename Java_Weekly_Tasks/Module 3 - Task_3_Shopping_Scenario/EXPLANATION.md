# Module 3: Shopping Scenario

## 1. Objective
Represent shopping orders as Java objects and analyse the orders using an `ArrayList` and the Stream API.

## 2. Files in this module

- `Order.java`: Defines the information stored for each shopping order.
- `Main.java`: Creates sample orders and performs analysis.

## 3. Code explanation

### Order.java
The `Order` class represents one shopping transaction. It stores:
- `orderId`: Unique order number.
- `customerName`: Name of the customer.
- `productName`: Name of the purchased product.
- `category`: Product category.
- `city`: Customer's city.
- `quantity`: Number of units ordered.
- `totalAmount`: Total value of the order.

The fields are `private final`, meaning they are assigned through the constructor and cannot be reassigned afterward. Getter methods provide access to their values.

The `toString()` method returns a readable representation of an order. This makes it easier to print order details.

### Main.java
The `main()` method creates six `Order` objects and stores them in an `ArrayList<Order>`.

The program then uses Stream API operations:

1. **Display all orders:** `forEach()` prints every order.
2. **Filter orders:** `filter()` selects orders with an amount greater than 10,000.
3. **Sort orders:** `sorted()` arranges orders from highest amount to lowest amount.
4. **Find highest order:** `max()` finds the order with the greatest total amount.
5. **Find lowest order:** `min()` finds the order with the smallest total amount.
6. **Calculate total sales:** `mapToDouble()` extracts amounts and `sum()` adds them.
7. **Calculate average order value:** `average()` calculates the mean order amount.
8. **Count orders:** `count()` returns the number of orders.
9. **Group by category:** `Collectors.groupingBy()` creates groups based on product category.
10. **Group by city:** A second grouping operation groups orders by city, and `size()` counts the orders in each city.

## 4. Important Java concepts

| Concept | Meaning in this task |
|---|---|
| Class and object | Each order is represented by an `Order` object |
| `ArrayList` | Stores all order objects |
| `filter()` | Selects elements that match a condition |
| `sorted()` | Arranges elements in a chosen order |
| `max()` / `min()` | Finds the largest or smallest value |
| `sum()` | Adds numeric values |
| `average()` | Calculates the mean |
| `count()` | Counts stream elements |
| `groupingBy()` | Groups objects according to a property |
| `toString()` | Provides readable object output |

## 5. Sample output summary

The six sample orders have these overall results:

- Number of orders: `6`
- Total sales: `91500.00`
- Average order value: `15250.00`
- Highest order: Laptop, `55000.00`
- Lowest order: Headphones, `5000.00`

The program also prints orders above 10,000, orders sorted by amount, orders grouped by category, and order counts grouped by city.

## 6. How to compile and run

Run these commands from this module's `src` directory:

```bash
javac Order.java Main.java
java Main
```

## 7. How to explain this task to the trainer

"I created an Order class to represent each shopping transaction. Each order stores customer, product, category, city, quantity, and amount details. I stored multiple orders in an ArrayList. Then I used Stream API operations to filter and sort orders, find the highest and lowest order values, calculate total and average sales, count orders, and group orders by category and city."

## 8. Key takeaway
This task demonstrates how Java collections can store business data and how Stream API operations can extract useful information from that data.
