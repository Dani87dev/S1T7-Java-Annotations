# SPRINT1.07 Java Annotations

The main objective is to practice the use of basic Java annotations. We work with standard annotations such as `@Override` and `@Deprecated` to improve code clarity, correctness, and maintainability, applying them within a class hierarchy that uses inheritance and polymorphism.

---

# TASK 1 LEVEL 1
## 📌 Exercise Statement

1 - Create a class hierarchy with three classes: `Worker`, `OnlineWorker`, and `OnsiteWorker`.

2 - The `Worker` class must include the attributes `name`, `surname`, and `pricePerHour`, as well as a method `calculateSalary()` that receives the number of worked hours as a parameter and multiplies it by the hourly price.

3 - The child classes must override the `calculateSalary()` method using the `@Override` annotation.

4 - From the `main()` method of a `Main` class, invoke the necessary methods to demonstrate the correct behavior of the overridden methods.

5 - In the `OnsiteWorker` class, the salary calculation method will receive the number of hours worked per month. The salary is calculated by multiplying the hours worked by the hourly price and adding the value of a static attribute called `fuel`.

6 - In the `OnlineWorker` class, the salary calculation method will receive the number of hours worked per month. The salary is calculated by multiplying the hours worked by the hourly price and adding the cost of a flat Internet fee, which must be defined as a constant in the `OnlineWorker` class.

---

# TASK 1 LEVEL 2
## 📌 Exercise Statement

1 - Add deprecated methods to the child classes using the `@Deprecated` annotation.

2 - From an external class, invoke the deprecated methods.

3 - Suppress the deprecation warnings using the appropriate annotation.

---

## 🛠 Technologies

- Java: 21 (LTS)  
- IDE: IntelliJ IDEA  
- Version Control: Git  
- Repository Hosting: GitHub  

## 🚀 Installation and Execution

### Prerequisites
* Java Development Kit (JDK) 8+ is required.

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Dani87dev/S1T3-Annotations.git
