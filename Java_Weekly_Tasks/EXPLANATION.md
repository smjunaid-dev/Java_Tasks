# Java Weekly Tasks: Code Explanation

This document explains the purpose, structure and important Java concepts used in each module.

---

## Module 1: Task 1 - Employee Interface

### Objective
Create an `Employee` interface, implement it in a concrete class, store employee objects and perform basic analysis using Java Streams.

### Files
- `Employee.java`: Defines the contract that employee classes must follow.
- `EmployeeImpl.java`: Implements the interface and stores employee details.
- `Main.java`: Creates employee objects and performs operations.

### Important concepts

1. **Interface**: `Employee` declares methods such as `getName()` and `getSalary()`. It specifies what an implementing class must provide.
2. **Implementation**: `EmployeeImpl implements Employee` provides the actual method bodies.
3. **Encapsulation**: Employee fields are private and accessed through getter methods.
4. **ArrayList**: Stores multiple employee objects in one collection.
5. **Stream API**:
   - `mapToDouble()` extracts salary values for calculations.
   - `average()` calculates the average salary.
   - `max()` and `min()` identify the highest- and lowest-paid employees.
   - `forEach()` displays employee information.

### Expected result
The program displays all employees, the average salary, and the employees with the highest and lowest salaries. With the sample data, the average salary is `52000.0`, the highest-paid employee is Aman, and the lowest-paid employee is Sara.

### How to explain it
"I created an Employee interface to define common employee operations. EmployeeImpl implements that interface and keeps employee data private. In Main, I created a list of employees and used Stream API operations to calculate the average salary and find the highest- and lowest-paid employees."

---

## Module 2: Task 2 - Blueprint

### Objective
Demonstrate how a class acts as a blueprint and how objects use fields, constructors and methods.

### Files
- `Car.java`: Defines the Car class.
- `Main.java`: Creates and uses Car objects.

### Important concepts

1. **Class**: `Car` is the blueprint describing the data and behaviour of a car.
2. **Object**: Each `new Car(...)` statement creates a separate car object.
3. **Private fields**: `brand`, `model` and `speed` cannot be accessed directly from outside the class.
4. **Constructor**: Initializes an object when it is created.
5. **Methods**:
   - `displayDetails()` displays the car's information.
   - `accelerate()` increases speed.
   - `brake()` decreases speed without allowing it to become negative.
6. **Encapsulation**: Data is protected inside the class and changed through methods.

### How to explain it
"Car is a class, which works as a blueprint. I created objects from it using a constructor. The fields are private to protect the data. The accelerate and brake methods change the speed in a controlled way."

---

## Module 3: Task 3 - Shopping Scenario

### Objective
Represent shopping orders as objects and analyse the orders using Java collections and Stream API.

### Files
- `Order.java`: Defines the data stored for each order.
- `Main.java`: Creates sample orders and performs analysis.

### Order fields
Each order contains an order ID, customer name, product name, category, city, quantity and total amount.

### Important concepts

1. **Class and objects**: Each `Order` object represents one shopping order.
2. **ArrayList**: Stores all orders.
3. **Filtering**: `filter()` selects orders that satisfy a condition, such as orders above a specified amount.
4. **Sorting**: `sorted()` arranges orders by amount.
5. **Maximum and minimum**: `max()` and `min()` identify the largest and smallest orders.
6. **Aggregation**: `mapToDouble().sum()` calculates total sales and `average()` calculates average order value.
7. **Grouping**: `Collectors.groupingBy()` groups orders by a property such as category or city.
8. **Counting**: `count()` returns the number of orders.

### Expected result
The sample data contains six orders. Their combined order value is `91500.0`, and the average order value is `15250.0`.

### How to explain it
"I created an Order class to represent each shopping transaction. I stored six orders in an ArrayList. Then I used Stream API methods to filter and sort orders, find the maximum and minimum order values, calculate total and average sales, and group orders by category and city."

---

## Module 4: Task 4 - Date and Time

### Objective
Practise Java's modern Date and Time API from the `java.time` package.

### File
- `Main.java`: Demonstrates common date and time operations.

### Important concepts

1. **LocalDate**: Represents a date without a time or time zone.
2. **LocalTime**: Represents a time without a date or time zone.
3. **LocalDateTime**: Represents both date and time without a time zone.
4. **DateTimeFormatter**: Formats a date or time into readable text.
5. **Period**: Calculates the date-based difference between two dates, such as years, months and days.
6. **Duration**: Calculates a time-based difference, such as hours and minutes.
7. **Date calculations**: `plusDays()`, `minusDays()` and `withDayOfMonth()` create adjusted date values.

### How to explain it
"I used the java.time package to work with dates and times. LocalDate stores only a date, LocalTime stores only a time, and LocalDateTime stores both. DateTimeFormatter changes the display format. Period calculates the difference between dates, while Duration calculates the difference between times."

### Important note
The program uses fixed sample dates and times so that the output remains predictable during demonstration. `LocalDate.now()` and `LocalTime.now()` can be used when the current system date and time are required.
