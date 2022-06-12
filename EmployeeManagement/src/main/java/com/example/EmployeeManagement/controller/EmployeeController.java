package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.model.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeController {

    //Read
    public ResponseEntity<Employee> getEmployee(Integer id);

    //Update
    public ResponseEntity<Employee> updateEmployee(Integer id, String address);

    //Create
    public ResponseEntity<Employee> createEmployee(Employee employee);

    //Delete
    public ResponseEntity deleteEmployee(Integer id);
}
