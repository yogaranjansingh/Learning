package com.example.EmployeeManagement.data;

import com.example.EmployeeManagement.model.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class DummyDataProvider {

    static HashMap<Integer, Employee> employees  = new HashMap<>();

    public List<Employee> getEmployees() {
        return (List<Employee>) employees.values();
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public Employee createEmployee(Employee employee) {

        employees.put(employee.id, employee);
        return employee;
    }

    public Employee updateEmployee(int id, String address) {
        Employee employee = employees.get(id);
        employee.address = address;
        employees.put(id, employee);
        return employee;
    }

    public void deleteEmployee(int id) {
        employees.remove(id);
    }

}
