# Hospital System Application

## Project Description

This project is a Hospital Management System developed using Java Object-Oriented Programming (OOP) principles.

The system includes:

* Abstract classes (Human, Employee)
* Inheritance (Employee extends Human)
* Interfaces (Payable, Reservable)
* Polymorphism (method overriding)

The application allows users to:

* Enter client (patient) details
* Enter specialist (doctor) details
* Process payments
* Reserve appointment slots

---

## Dynamic Input Implementation

The program uses the Scanner class to allow users to input data at runtime instead of using fixed (hardcoded) values.

User inputs include:

* Client name, age, and illness
* Doctor name, age, salary, and specialization
* Payment amount

This makes the system interactive and more realistic.

---

## Exception Handling Implemented

### 1. InputMismatchException

This exception is used to handle cases where the user enters the wrong data type.

Example:

* Entering text instead of a number for age or salary

Handled using:
try {
// input code
} catch (InputMismatchException e) {
System.out.println("Invalid input type!");
}

---

### 2. General Exception

A general Exception is used to catch any unexpected errors that may occur during program execution.

This ensures the program does not crash.

---

### 3. finally Block

The finally block is used to close the Scanner object.

This ensures proper resource management and prevents memory leaks.

Example:
finally {
input.close();
}

---

## Example Errors Handled

* Entering letters instead of numbers
* Invalid salary or age input
* Unexpected runtime errors

---

## Conclusion

The program has been improved by adding dynamic user input and exception handling.

This makes the application:

* More user-friendly
* More interactive
* More robust and error-resistant
