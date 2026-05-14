# Bank Account System

Project developed in Java focusing on practicing Object-Oriented Programming concepts, constructors, encapsulation, and account operations simulation.

The system allows creating a bank account with or without an initial deposit, performing deposits and withdrawals, and displaying updated account information directly in the console.

---

## Features

- Bank account registration
- Optional initial deposit
- Deposit operation
- Withdraw operation with fee discount
- Account data visualization
- Automatic balance update

---

## Technologies Used

- Java
- Eclipse IDE

---

## Concepts Practiced

- Classes and Objects
- Constructors Overloading
- Encapsulation
- Methods
- Conditional Structures (`if/else`)
- User input with `Scanner`
- String formatting
- Object manipulation

---

## Project Structure

src
├── application
│   └── Main.java
└── entities
    └── Account.java

---

## Execution Example

Enter account number: 1020
Enter account holder: Yuri
Is there an initial deposit (y/n)? y
Enter initial deposit: 500.00

Account data:
Account 1020, Holder: Yuri, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 1020, Holder: Yuri, Balance: $ 700.00

Enter a withdraw value: 100.00
Updated account data:
Account 1020, Holder: Yuri, Balance: $ 595.00

---

## Business Rules

- Each withdraw operation charges a fixed fee of `$5.00`
- The account holder name can be updated
- The account number cannot be changed after account creation

---

## Project Goal

This project was created to strengthen Java fundamentals and Object-Oriented Programming concepts through a simple banking system simulation.

---

## Author

Yuri Fernandes
