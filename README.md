# Java IO - UC6: Read Employee Payroll File for Analysis

## Objective

Implement a Java program to read the **Employee Payroll** file using the **Java NIO (New Input/Output) API**, convert the file contents into `EmployeePayrollData` objects, and prepare the data for further analysis.

---

# Problem Statement

The Employee Payroll application can already:

- Store employee payroll data into a file (UC4).
- Read and display the payroll file (UC5).

This use case extends the application by reading the payroll file, converting each record into an `EmployeePayrollData` object, and storing the objects in a collection. This prepares the data for future analysis such as searching, sorting, filtering, and salary calculations.

---

# Project Structure

```text
EmployeePayrollSystem
│
├── src
│   └── main
│       └── java
│           └── com
│               └── bridgelabz
│                   └── employeepayroll
│                       ├── EmployeePayrollData.java
│                       ├── EmployeePayrollService.java
│                       ├── EmployeePayrollSystem.java
│                       └── EmployeePayrollAnalyzer.java
│
├── PayrollFiles
│   └── employee-payroll.txt
│
├── README.md
└── pom.xml
```

---

# Classes

## EmployeePayrollData

### Responsibilities

- Store employee information.
- Provide constructors.
- Override the `toString()` method for displaying employee details.

### Fields

- Employee ID
- Employee Name
- Employee Salary

---

## EmployeePayrollAnalyzer

### Responsibilities

- Read employee payroll data from the file.
- Convert each record into an `EmployeePayrollData` object.
- Store employee objects in a list.
- Display employee payroll information.
- Count the total number of employee records.

---

# Java NIO Classes Used

## Path

Represents the location of the employee payroll file.

Example:

```java
Path filePath = Paths.get("PayrollFiles", "employee-payroll.txt");
```

---

## Paths

Creates a `Path` object.

Example:

```java
Paths.get("PayrollFiles", "employee-payroll.txt");
```

---

## Files

Provides utility methods for file operations.

Methods used:

- `readAllLines()`

---

# Collection Used

## ArrayList

```java
List<EmployeePayrollData>
```

Stores employee payroll objects after reading the file.

---

# Features Implemented

- Read employee payroll data from a file.
- Convert text records into Java objects.
- Store employee objects in a list.
- Display employee payroll details.
- Count the total number of employee records.
- Prepare employee data for future analysis.

---

# Program Flow

1. Start the application.
2. Locate the employee payroll file.
3. Read all employee records.
4. Split each record into individual fields.
5. Create an `EmployeePayrollData` object for each record.
6. Store the objects in a list.
7. Display employee payroll information.
8. Count the total number of employee records.
9. End the program.

---

# Sample Input File

```text
101,Jyothish,50000.0
102,Rahul,45000.0
103,Kiran,60000.0
```

---

# Sample Output

```text
Employee Payroll Data
-------------------------

EmployeePayrollData{id=101, name='Jyothish', salary=50000.0}
EmployeePayrollData{id=102, name='Rahul', salary=45000.0}
EmployeePayrollData{id=103, name='Kiran', salary=60000.0}

Total Employees : 3
```

---

# Java Concepts Used

- Java NIO (`java.nio.file`)
- Path
- Paths
- Files
- List
- ArrayList
- Constructors
- String Manipulation (`split()`)
- Parsing (`Integer.parseInt()`, `Double.parseDouble()`)
- Exception Handling (`IOException`)
- Method Overriding (`toString()`)

---

# Learning Outcome

After completing UC6, you will understand how to:

- Read employee payroll data from a file.
- Convert text data into Java objects.
- Store objects in a collection.
- Prepare employee data for further analysis.
- Work with Java NIO for reading structured file data.

---

# Future Analysis

The employee data stored in the list can later be used for:

- Search employee by ID or Name
- Sort employees
- Calculate total salary
- Calculate average salary
- Find highest and lowest salary
- Filter employees based on salary

---

# Git Branch

```text
feature/UC6-AnalyzeEmployeePayrollFile
```

---

# Commit Message

```text
feat(UC6): read employee payroll file and prepare data for analysis
```

---

# Project Status

- ✅ UC1 - Read and Write Employee Payroll to Console
- ✅ UC2 - Basic File Operations
- ✅ UC3 - Watch Service
- ✅ UC4 - Write Employee Payroll to File
- ✅ UC5 - Read Employee Payroll from File
- ✅ UC6 - Read Employee Payroll File for Analysis