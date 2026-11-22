<div align="center">

# ☕ Java Weekly Tasks

### Java Internship Training

A collection of four independent Java modules covering core OOP, collections, the Stream API, and the modern Date-Time API.

![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=openjdk&logoColor=white)
![Modules](https://img.shields.io/badge/Modules-4-blue)
![Build](https://img.shields.io/badge/Build-javac-success)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen)

</div>

---

## 📑 Table of Contents

- [Overview](#-overview)
- [Repository Structure](#-repository-structure)
- [Requirements](#-requirements)
- [Quick Start](#-quick-start)
- [Module Guide](#-module-guide)
- [Git Setup and Push](#-git-setup-and-push)
- [Notes](#-notes)

---

## 🎯 Overview

This repository contains **four independent Java modules**. Each one lives in its own folder, has its own `Main.java`, and can be compiled and run separately. Every module also ships with an `EXPLANATION.md` covering the objective, a file-by-file walkthrough, key concepts, run commands, sample output, and a short trainer explanation.

| # | Module | Key Concepts |
|:-:|--------|--------------|
| 1 | **Employee Interface** | Interfaces, implementation, encapsulation, collections, Stream API |
| 2 | **Blueprint** | Classes, objects, constructors, private fields, methods, encapsulation |
| 3 | **Shopping Scenario** | Classes, objects, `ArrayList`, Stream API, filtering, sorting, grouping, aggregation |
| 4 | **Date and Time** | `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`, `DateTimeFormatter` |

---

## 📂 Repository Structure

```text
Java_Weekly_Tasks/
├── Module 1 - Task_1_Employee_Interface/
│   ├── EXPLANATION.md
│   └── src/
│       ├── Employee.java
│       ├── EmployeeImpl.java
│       └── Main.java
│
├── Module 2 - Task_2_Blueprint/
│   ├── EXPLANATION.md
│   └── src/
│       ├── Car.java
│       └── Main.java
│
├── Module 3 - Task_3_Shopping_Scenario/
│   ├── EXPLANATION.md
│   └── src/
│       ├── Order.java
│       └── Main.java
│
├── Module 4 - Task_4_Date_time/
│   ├── EXPLANATION.md
│   └── src/
│       └── Main.java
│
└── EXPLANATION.md
```

---

## 🛠 Requirements

- **Java JDK 8** or later
- A terminal or command prompt
- **Git** (for version control)

Verify your Java installation:

```bash
java -version
javac -version
```

---

## 🚀 Quick Start

1. Open a terminal inside the `src` folder of the module you want to run.
2. Compile the `.java` files.
3. Run `Main`.

> 💡 **Tip:** Always run commands from the module's `src` folder to avoid classpath confusion.

---

## 📘 Module Guide

<details>
<summary><b>Module 1 · Employee Interface</b></summary>

<br>

**Concepts:** Interfaces, implementation, encapsulation, collections, Stream API

```bash
javac Employee.java EmployeeImpl.java Main.java
java Main
```

</details>

<details>
<summary><b>Module 2 · Blueprint</b></summary>

<br>

**Concepts:** Classes, objects, constructors, private fields, methods, encapsulation

```bash
javac Car.java Main.java
java Main
```

</details>

<details>
<summary><b>Module 3 · Shopping Scenario</b></summary>

<br>

**Concepts:** Classes, objects, `ArrayList`, Stream API, filtering, sorting, grouping, aggregation

```bash
javac Order.java Main.java
java Main
```

</details>

<details>
<summary><b>Module 4 · Date and Time</b></summary>

<br>

**Concepts:** `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`, `DateTimeFormatter`

```bash
javac Main.java
java Main
```

</details>

---

## 🔀 Git Setup and Push

### First-time setup

Create an empty repository on GitHub, then open a terminal in the `Java_Weekly_Tasks` folder:

```bash
git init
git add .
git commit -m "Add Java weekly internship tasks"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
git push -u origin main
```

> Replace the remote URL with your actual GitHub repository URL.

If a remote is already configured, don't add it again. Check it with:

```bash
git remote -v
```

### Pushing later changes

```bash
git add .
git commit -m "Update Java weekly tasks"
git push
```

---

## 📝 Notes

- Each module has its own `Main.java`. This is intentional, so every task runs independently.
- Run commands from the module's `src` folder to avoid classpath confusion.
- The examples use simple, readable code suitable for explaining during a training review.

---

<div align="center">

**Built as part of the HCL Java Internship Training** ☕

</div>
