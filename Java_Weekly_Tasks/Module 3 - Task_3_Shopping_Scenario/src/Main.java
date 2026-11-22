import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1, "Aman", "Laptop", "Electronics", "Hyderabad", 1, 55000));
        orders.add(new Order(2, "Sara", "Headphones", "Electronics", "Chennai", 2, 5000));
        orders.add(new Order(3, "Rahul", "Chair", "Furniture", "Hyderabad", 1, 7500));
        orders.add(new Order(4, "Priya", "Phone", "Electronics", "Bengaluru", 1, 18000));
        orders.add(new Order(5, "Kiran", "Table", "Furniture", "Chennai", 1, 6000));
        orders.add(new Order(6, "Neha", "Watch", "Accessories", "Bengaluru", 1, 10000));

        System.out.println("===== ALL SHOPPING ORDERS =====");
        orders.forEach(System.out::println);

        System.out.println("\n===== ORDERS ABOVE 10000 =====");
        orders.stream()
                .filter(order -> order.getTotalAmount() > 10000)
                .forEach(System.out::println);

        System.out.println("\n===== ORDERS SORTED BY AMOUNT (HIGH TO LOW) =====");
        orders.stream()
                .sorted(Comparator.comparingDouble(Order::getTotalAmount).reversed())
                .forEach(System.out::println);

        Order highestOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getTotalAmount))
                .orElse(null);

        Order lowestOrder = orders.stream()
                .min(Comparator.comparingDouble(Order::getTotalAmount))
                .orElse(null);

        double totalSales = orders.stream()
                .mapToDouble(Order::getTotalAmount)
                .sum();

        double averageOrderValue = orders.stream()
                .mapToDouble(Order::getTotalAmount)
                .average()
                .orElse(0.0);

        long orderCount = orders.stream().count();

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Highest Order: " + highestOrder);
        System.out.println("Lowest Order: " + lowestOrder);
        System.out.printf("Total Sales: %.2f%n", totalSales);
        System.out.printf("Average Order Value: %.2f%n", averageOrderValue);
        System.out.println("Total Number of Orders: " + orderCount);

        Map<String, List<Order>> ordersByCategory = orders.stream()
                .collect(Collectors.groupingBy(Order::getCategory));

        System.out.println("\n===== ORDERS GROUPED BY CATEGORY =====");
        ordersByCategory.forEach((category, categoryOrders) -> {
            System.out.println(category + ":");
            categoryOrders.forEach(order ->
                    System.out.println("  " + order.getProductName()
                            + " - " + order.getTotalAmount()));
        });

        Map<String, List<Order>> ordersByCity = orders.stream()
                .collect(Collectors.groupingBy(Order::getCity));

        System.out.println("\n===== ORDER COUNT BY CITY =====");
        ordersByCity.forEach((city, cityOrders) ->
                System.out.println(city + ": " + cityOrders.size()));
    }
}
