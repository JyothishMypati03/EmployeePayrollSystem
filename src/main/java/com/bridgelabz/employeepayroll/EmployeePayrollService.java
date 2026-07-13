package com.bridgelabz.employeepayroll;
import java.util.List;
import java.util.Scanner;

// This class contains the business logic for Employee Payroll
public class EmployeePayrollService {

    // List to store employee records
    private List<EmployeePayrollData> employeePayrollList;

    // Constructor to initialize employee list
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    // Reads employee details from the console
    public void readEmployeePayrollData(Scanner scanner) {

        System.out.print("Enter Employee ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();   // Consume newline

        System.out.print("Enter Employee Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary : ");
        double salary = scanner.nextDouble();

        // Create Employee object
        EmployeePayrollData employee =
                new EmployeePayrollData(id, name, salary);

        // Add employee to the list
        employeePayrollList.add(employee);
    }

    // Writes employee details to the console
    public void writeEmployeePayrollData() {

        System.out.println("\nWriting Employee Payroll To Console\n");

        for (EmployeePayrollData employee : employeePayrollList) {
            System.out.println(employee);
        }
    }



}
