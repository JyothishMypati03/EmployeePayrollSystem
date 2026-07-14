package com.bridgelabz.employeepayroll;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This class contains the business logic for Employee Payroll
public class EmployeePayrollService {

    // Store employees
    private List<EmployeePayrollData> employeeList = new ArrayList<>();

    // Add employee
    public void addEmployee(EmployeePayrollData employee) {
        employeeList.add(employee);
    }

    // Write employee data into file
    public void writeEmployeePayroll() {

        try {

            // Create folder if not exists
            Path folder = Paths.get("PayrollFiles");

            if (!Files.exists(folder)) {
                Files.createDirectories(folder);
            }

            // File path
            Path file = folder.resolve("employee-payroll.txt");

            // List of lines
            List<String> lines = new ArrayList<>();

            // Convert employee objects into text
            for (EmployeePayrollData employee : employeeList) {
                lines.add(employee.toString());
            }

            // Write into file
            Files.write(file, lines);

            System.out.println("Employee Payroll Written Successfully.");

            // Count entries
            System.out.println("Number of Employees : "
                    + employeeList.size());

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }

}
