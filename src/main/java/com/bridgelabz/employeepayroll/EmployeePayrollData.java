package com.bridgelabz.employeepayroll;

//this class stores employee details
public class EmployeePayrollData {

    // Employee information
    private int id ;
    private String name ;
    private double salary;

    //Parameterized constructor to initialize employee details
    public EmployeePayrollData( int id , String name , double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public  EmployeePayrollData(){}

    // Returns employee ID
    public int getId() {
        return id;
    }

    // Returns employee name
    public String getName() {
        return name;
    }

    // Returns employee salary
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
