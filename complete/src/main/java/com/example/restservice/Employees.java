package com.example.restservice;


import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employee_list;

    public Employees() {
        this.employee_list = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        if (employee_list == null) {
            employee_list = new ArrayList<>();
        }
        return employee_list;
    }

    public void setEmployeeList(List<Employee> employee_list) {
        this.employee_list = employee_list;
    }
}
