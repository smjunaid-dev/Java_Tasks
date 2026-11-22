# Module 1: Employee Interface

## 1. Objective
Create an employee management example using a Java interface and a class that implements it. Store multiple employees and analyse their salaries.

## 2. Files in this module

- `Employee.java`: Declares the common operations every employee must provide.
- `EmployeeImpl.java`: Implements the interface and stores each employee's details.
- `Main.java`: Creates employee objects, stores them in a list, and performs salary calculations.

## 3. Code explanation

### Employee.java
The `Employee` interface declares four methods:
- `getName()` returns the employee's name.
- `getDepartment()` returns the employee's department.
- `getSalary()` returns the employee's salary.
- `displayDetails()` displays the employee's information.

An interface defines a contract. It tells implementing classes which methods they must provide, but does not store the employee data itself.

### EmployeeImpl.java
`EmployeeImpl implements Employee`, so it provides the body for all interface methods.

The fields `employeeId`, `name`, `department`, and `salary` are `private`. This is an example of encapsulation because the data is kept inside the class and accessed through public getter methods.

The constructor initializes the fields when an object is created. The `@Override` annotation indicates that the methods implement methods declared by the interface.

### Main.java
The `main()` method:
1. Creates an `ArrayList` that can store objects through the `Employee` interface type.
2. Adds five `EmployeeImpl` objects to the list.
3. Uses `forEach()` to display every employee.
4. Uses `stream()` and `mapToDouble()` to obtain salary values.
5. Uses `average()` to calculate the average salary.
6. Uses `max()` and `min()` with `Comparator` to find the highest- and lowest-paid employees.

## 4. Important Java concepts

| Concept | Meaning in this task |
|---|---|
| Interface | Defines methods that implementing classes must provide |
| `implements` | Connects a class to an interface |
| Encapsulation | Keeps fields private and exposes controlled access through methods |
| Constructor | Initializes a newly created employee object |
| `ArrayList` | Stores multiple employee objects |
| Stream API | Processes collection data |
| `Comparator` | Defines how employee salaries are compared |

## 5. Sample output summary

The sample data contains five employees.

- Average salary: `52000.00`
- Highest-paid employee: Aman, `75000.00`
- Lowest-paid employee: Sara, `35000.00`

## 6. How to compile and run

Run these commands from this module's `src` directory:

```bash
javac Employee.java EmployeeImpl.java Main.java
java Main
```

## 7. How to explain this task to the trainer

"I created an Employee interface to define the common operations for employee details. EmployeeImpl implements that interface and stores employee information using private fields. In the Main class, I created multiple employee objects and stored them in an ArrayList. I then used Java Stream API operations to display employees, calculate the average salary, and identify the highest- and lowest-paid employees."

## 8. Key takeaway
This task demonstrates how interfaces support abstraction and how classes implement those contracts. It also introduces encapsulation, collections, and basic Stream API operations.
