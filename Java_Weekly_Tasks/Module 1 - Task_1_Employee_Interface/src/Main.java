import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new EmployeeImpl(101, "Aman", "IT", 75000));
        employees.add(new EmployeeImpl(102, "Sara", "HR", 35000));
        employees.add(new EmployeeImpl(103, "Rahul", "Finance", 50000));
        employees.add(new EmployeeImpl(104, "Priya", "IT", 55000));
        employees.add(new EmployeeImpl(105, "Kiran", "Sales", 45000));

        System.out.println("===== EMPLOYEE DETAILS =====");
        employees.forEach(Employee::displayDetails);

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        Employee highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        Employee lowestPaid = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.printf("%nAverage Salary: %.2f%n", averageSalary);
        System.out.println("Highest Paid Employee: " +
                highestPaid.getName() + " ("
                + highestPaid.getSalary() + ")");
        System.out.println("Lowest Paid Employee: " +
                lowestPaid.getName() + " ("
                + lowestPaid.getSalary() + ")");
    }
}
