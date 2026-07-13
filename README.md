# 📌 Java IO - UC1: Employee Payroll Service

## 🎯 Goal

Create an **Employee Payroll Service** that can **read** employee payroll details from the console and **write** them back to the console.

The employee record should contain:

- ID
- Name
- Salary

The PDF introduces UC1 as creating an Employee Payroll class with id, name, and salary, reading the information from the console, and finally writing it back to the console. :contentReference[oaicite:0]{index=0}

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User enters employee details.
2. System creates an `EmployeePayrollData` object.
3. System stores the employee data in a list.
4. System writes the employee payroll details to the console.

---

## 💡 Java Concepts Covered

- Class
- Object
- Constructor
- List
- Scanner
- Encapsulation
- `toString()`

---

## 📋 Functional Requirements

- Create an `EmployeePayrollData` class with:
    - id
    - name
    - salary
- Read employee details from the console.
- Store employee data in a `List<EmployeePayrollData>`.
- Print employee payroll details to the console.

---

## 📂 Project Structure

```text
EmployeePayrollSystem
│
├── src
│   └── com
│       └── bridgelabz
│           └── employeepayroll
│               ├── EmployeePayrollData.java
│               ├── EmployeePayrollService.java
│               └── EmployeePayrollSystem.java
│
├── README.md
└── .gitignore