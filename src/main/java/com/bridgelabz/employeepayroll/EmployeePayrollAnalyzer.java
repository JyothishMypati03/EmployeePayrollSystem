package com.bridgelabz.employeepayroll;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class EmployeePayrollAnalyzer {
    public static void main(String[] args) {

        // File path
        Path filePath = Paths.get("PayrollFiles", "employee-payroll.txt");

        // Store employee objects
        List<EmployeePayrollData> employeeList = new ArrayList<>();

        try {

            // Read all lines
            List<String> lines = Files.readAllLines(filePath);

            // Convert each line into EmployeePayrollData object
            for (String line : lines) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double salary = Double.parseDouble(data[2]);

                EmployeePayrollData employee =
                        new EmployeePayrollData(id, name, salary);

                employeeList.add(employee);
            }

            System.out.println("Employee Payroll Data");
            System.out.println("-------------------------");

            // Print all employees
            for (EmployeePayrollData employee : employeeList) {
                System.out.println(employee);
            }

            // Count employees
            System.out.println("\nTotal Employees : " + employeeList.size());

        } catch (IOException e) {

            System.out.println("Unable to read file.");

        }
    }
}
