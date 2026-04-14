# CRUD Employee Management System

## Overview

A lightweight, in-memory employee management system built with Java. This application provides a complete CRUD (Create, Read, Update, Delete) interface for managing employee records with thread-safe operations and robust error handling.

## Features

✅ **Add New Employees** - Create new employee records with name, role, and salary information
✅ **View All Employees** - Display a comprehensive list of all employees in the system
✅ **View Employee by ID** - Search and retrieve specific employee details using their unique ID
✅ **Update Employee** - Modify existing employee information (name, role, salary)
✅ **Delete Employee** - Remove employees from the system with confirmation
✅ **Thread-Safe Operations** - Uses AtomicInteger for safe concurrent ID generation
✅ **Input Validation** - Robust error handling for invalid user inputs
✅ **Interactive Menu** - User-friendly command-line interface

## Project Structure

CRUDEmployeeManagementSystem/ ├── src/ │ ├── Employee.java # Employee model class │ ├── EmployeeService.java # Business logic and CRUD operations │ └── Main.java # Application entry point and UI ├── bin/ # Compiled output files ├── .vscode/ # VS Code configuration └── README.md # Project documentation

Code

### File Descriptions

- **Employee.java**: Model class representing an employee with properties (ID, name, role, salary) and getter/setter methods
- **EmployeeService.java**: Service layer handling all CRUD operations using a HashMap for in-memory storage
- **Main.java**: Main application class with interactive menu system and user input handling

## Technologies Used

- **Language**: Java
- **IDE**: Visual Studio Code
- **Data Structure**: HashMap for efficient employee lookup
- **Concurrency**: AtomicInteger for thread-safe ID generation
- **Build**: Standard Java compilation

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- VS Code (optional) with Java Extension Pack

## Installation & Setup

1. **Clone the Repository**:
```bash
git clone https://github.com/Pluggamaro/CRUDEmployeeManagementSystem.git
cd CRUDEmployeeManagementSystem
Compile the Java Files:
bash
javac -d bin src/*.java
Run the Application:
bash
java -cp bin Main
Usage Guide
Once the application starts, you'll see the main menu:

Code
========Employee Management System========
1. Add New Employee
2. Update An Employee
3. Delete An Employee
4. View Employee By Id
5. View All Employees
6. EXIT
Available Operations
1. Add New Employee

Enter employee name, role, and salary
System automatically generates a unique ID
Employee is added to the system
2. Update An Employee

Enter the employee ID to update
Provide new name, role, and salary
Changes are saved immediately
3. Delete An Employee

Enter the employee ID to delete
System confirms successful deletion
4. View Employee By ID

Enter the employee ID
View detailed information about that employee
5. View All Employees

Displays a complete list of all employees currently in the system
6. EXIT

Closes the application and releases resources
Code Architecture
Employee Model
Java
public class Employee {
    private int employeeId;
    private String name;
    private String role;
    private double salary;
    // Getters and setters for all properties
}
EmployeeService (Business Logic)
Uses HashMap<Integer, Employee> for O(1) lookups
AtomicInteger for thread-safe ID generation
Methods: addEmployee(), getByEmployeeId(), getAllEmployees(), updateEmployee(), deleteByEmployeeId()
Main Class (User Interface)
Interactive menu-driven interface
Input validation with try-catch blocks
Helper methods: getInteger(), getDouble() for safe input handling
Sample Data
The application initializes with two mock employees:

ID: 1 - Gopolang Mothuba (Cashier, Salary: 9000)
ID: 2 - Edith Mongwa (Admin, Salary: 15000)
New employees will start from ID 3.

Error Handling
Invalid ID: System displays "Employee with ID X not found"
Invalid Input: Prompts user to re-enter valid numeric values
Empty Employee List: Notifies user when no employees exist
Thread Safety
The application uses AtomicInteger for the ID counter instead of a simple int to ensure thread-safe ID generation in multi-threaded environments.

Future Enhancements
Database integration (MySQL, PostgreSQL)
Persistent data storage
Employee search by name or department
Salary history tracking
Department management
GUI using Swing or JavaFX
REST API for external integration
Contributing
Contributions are welcome! To contribute:

Fork the repository
Create a feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request
License
This project is open source and available under the MIT License.

Author
Pluggamaro - https://github.com/Pluggamaro

Support
If you encounter any issues or have suggestions, please open an issue on the GitHub repository.

Last Updated: April 2026
