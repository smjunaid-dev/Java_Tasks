# Java Weekly Tasks

**HCL Java Internship Training**

This repository contains four independent Java modules. Each module has its own folder and can be compiled and executed separately.

## Repository structure

```text
Java_Weekly_Tasks/
├── Module 1 - Task_1_Employee_Interface/
│   ├── EXPLANATION.md
│   └── src/
│       ├── Employee.java
│       ├── EmployeeImpl.java
│       └── Main.java
├── Module 2 - Task_2_Blueprint/
│   ├── EXPLANATION.md
│   └── src/
│       ├── Car.java
│       └── Main.java
├── Module 3 - Task_3_Shopping_Scenario/
│   ├── EXPLANATION.md
│   └── src/
│       ├── Order.java
│       └── Main.java
├── Module 4 - Task_4_Date_time/
│   ├── EXPLANATION.md
│   └── src/
│       └── Main.java
└── EXPLANATION.md
```

## Requirements

- Java JDK 8 or later
- A terminal or command prompt
- Git (for version control)

Check Java installation:

```bash
java -version
javac -version
```

## How to compile and run

Open a terminal in the required module's `src` directory.

### Module 1: Employee Interface

```bash
javac Employee.java EmployeeImpl.java Main.java
java Main
```

### Module 2: Blueprint

```bash
javac Car.java Main.java
java Main
```

### Module 3: Shopping Scenario

```bash
javac Order.java Main.java
java Main
```

### Module 4: Date and Time

```bash
javac Main.java
java Main
```

## Module overview

Each module folder contains its own `EXPLANATION.md` with the objective, file-by-file code explanation, concepts, run commands, sample output summary, and a short trainer explanation.

| Module | Main concepts |
|---|---|
| 1. Employee Interface | Interfaces, implementation, encapsulation, collections, Stream API |
| 2. Blueprint | Classes, objects, constructors, private fields, methods, encapsulation |
| 3. Shopping Scenario | Classes, objects, ArrayList, Stream API, filtering, sorting, grouping and aggregation |
| 4. Date and Time | `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`, `DateTimeFormatter` |

## Git setup and push

Create an empty repository on GitHub. Then open a terminal in the `Java_Weekly_Tasks` folder and run:

```bash
git init
git add .
git commit -m "Add Java weekly internship tasks"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
git push -u origin main
```

Replace the remote URL with your actual GitHub repository URL.

If the remote is already configured, do not add it again. Check it using:

```bash
git remote -v
```

For later changes:

```bash
git add .
git commit -m "Update Java weekly tasks"
git push
```

## Notes

- Each module has its own `Main.java`. This is intentional because each task is designed to run independently.
- Run commands from the module's `src` folder to avoid classpath confusion.
- The examples use simple, readable code suitable for explaining during a training review.
