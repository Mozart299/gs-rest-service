package com.example.restservice;

public class EmployeeManager {
    private static Employees list = new Employees();

    static {
        list.getEmployees().add(
                new Employee(
                        0001,
                        "Peter",
                        "Kyeyune",
                        "peterk@gmail.com",
                        "Mr."));

        list.getEmployees().add(
                new Employee(
                        0001,
                        "Peter",
                        "Kyeyune",
                        "peterk@gmail.com",
                        "Mr."));

        list.getEmployees().add(
                new Employee(
                        0001,
                        "Peter",
                        "Kyeyune",
                        "peterk@gmail.com",
                        "Mr."));

        list.getEmployees().add(
                new Employee(
                        0001,
                        "Peter",
                        "Kyeyune",
                        "peterk@gmail.com",
                        "Mr."));

        list.getEmployees().add(
                new Employee(
                        0001,
                        "Peter",
                        "Kyeyune",
                        "peterk@gmail.com",
                        "Mr."));

    }

    public static Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployees().add(employee);
    }
}
