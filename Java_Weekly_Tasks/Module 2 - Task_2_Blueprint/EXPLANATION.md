# Module 2: Blueprint

## 1. Objective
Demonstrate how a Java class acts as a blueprint for creating objects, and how objects use fields, constructors, and methods.

## 2. Files in this module

- `Car.java`: Defines the properties and behaviour of a car.
- `Main.java`: Creates car objects and calls their methods.

## 3. Code explanation

### Car.java
The `Car` class defines three fields:
- `brand`: The manufacturer of the car.
- `model`: The car model.
- `speed`: The current speed.

The fields are `private`, so they cannot be accessed directly from another class. This protects the object's internal data.

The constructor `Car(String brand, String model, int speed)` initializes a car when it is created. `Math.max(speed, 0)` ensures that the initial speed cannot be negative.

The `displayDetails()` method prints the car's information.

The `accelerate(int increase)` method increases speed only when the supplied value is positive.

The `brake(int decrease)` method reduces speed only when the supplied value is positive. `Math.max(0, speed - decrease)` prevents the speed from going below zero.

### Main.java
The `main()` method creates two separate objects:

```java
Car car1 = new Car("Toyota", "Fortuner", 40);
Car car2 = new Car("Hyundai", "Creta", 25);
```

Each object has its own field values. The program displays their details, accelerates them, applies brakes, and displays the updated speeds.

## 4. Important Java concepts

| Concept | Meaning in this task |
|---|---|
| Class | A blueprint that defines fields and methods |
| Object | An instance created from a class |
| Field | A variable that stores an object's data |
| Constructor | Initializes an object |
| Method | Defines an object's behaviour |
| `private` | Restricts direct access from outside the class |
| Encapsulation | Protects object data by controlling how it is changed |

## 5. Sample output summary

- Toyota Fortuner starts at 40 km/h.
- It accelerates by 30 km/h, reaching 70 km/h.
- It brakes by 20 km/h, reaching 50 km/h.
- Hyundai Creta starts at 25 km/h, accelerates by 15 km/h, and then brakes by 50 km/h. Its final speed is 0 km/h.

## 6. How to compile and run

Run these commands from this module's `src` directory:

```bash
javac Car.java Main.java
java Main
```

## 7. How to explain this task to the trainer

"I created a Car class that acts as a blueprint. It contains fields for brand, model, and speed, along with a constructor to initialize each object. I created two Car objects in Main. The accelerate and brake methods change each object's speed. I used private fields to demonstrate encapsulation and added checks to prevent invalid speed values."

## 8. Key takeaway
A class defines the structure and behaviour of objects. Each object has its own state, and methods provide controlled ways to work with that state.
