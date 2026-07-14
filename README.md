# Java IO - UC5: Read Employee Payroll from a File

## Objective

Implement a Java program to read **Employee Payroll** information from a text file using the **Java NIO (New Input/Output) API**.

The application reads employee payroll records from the file, displays them on the console, and counts the total number of employee entries.

---

# Problem Statement

The Employee Payroll application can store employee payroll information in a file (UC4).

This use case extends the application by reading the stored employee payroll data from the file and displaying it on the console.

The application also counts the number of employee records to ensure that the file has been read successfully.

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
│                       └── EmployeePayrollFileReader.java
│
├── PayrollFiles
│   └── employee-payroll.txt
│
├── README.md
└── pom.xml
```

---

# Classes

## EmployeePayrollFileReader

### Responsibilities

- Locate the employee payroll file.
- Read all employee payroll records.
- Display each employee record on the console.
- Count the total number of employee entries.
- Handle file reading exceptions.

---

# Java NIO Classes Used

## Path

Represents the location of the payroll file.

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

## List<String>

```java
List<String> lines
```

Stores all the lines read from the employee payroll file.

---

# Features Implemented

- Read employee payroll data from a text file.
- Display all employee payroll records.
- Count the number of employee records.
- Handle file reading errors.

---

# Program Flow

1. Start the application.
2. Locate the employee payroll file.
3. Read all employee records from the file.
4. Display each employee record.
5. Count the total number of employee entries.
6. Display the total number of employees.
7. End the program.

---

# Sample Output

```text
Employee Payroll Data
---------------------

101,Jyothish,50000.0
102,Rahul,45000.0
103,Kiran,60000.0

Total Employees : 3
```

---

# Sample File (employee-payroll.txt)

```text
101,Jyothish,50000.0
102,Rahul,45000.0
103,Kiran,60000.0
```

---

# Java Concepts Used

- Java NIO (`java.nio.file`)
- Path
- Paths
- Files
- List
- Enhanced For Loop
- Exception Handling (`IOException`)

---

# Learning Outcome

After completing UC5, you will understand how to:

- Read data from a file using Java NIO.
- Display file contents on the console.
- Count the number of records in a file.
- Handle file reading exceptions.

---

# Git Branch

```text
feature/UC5-ReadEmployeePayrollFromFile
```

---

# Commit Message

```text
feat(UC5): read employee payroll data from file using Java NIO
```

---
