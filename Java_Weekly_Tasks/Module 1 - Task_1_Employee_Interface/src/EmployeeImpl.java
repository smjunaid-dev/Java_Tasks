public class EmployeeImpl implements Employee {
    private final int employeeId;
    private final String name;
    private final String department;
    private final double salary;

    public EmployeeImpl(int employeeId, String name,
                        String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void displayDetails() {
        System.out.printf(
            "ID: %d | Name: %s | Department: %s | Salary: %.2f%n",
            employeeId, name, department, salary
        );
    }
}
