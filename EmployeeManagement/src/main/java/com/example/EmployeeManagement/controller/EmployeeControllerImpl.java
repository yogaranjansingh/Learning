package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.data.DummyDataProvider;
import com.example.EmployeeManagement.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeControllerImpl implements EmployeeController{

    @Autowired
    DummyDataProvider dummyDataProvider;

    @Override
    @GetMapping(path="/get/{id}", produces = "application/json")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id) {
        Employee employee =  dummyDataProvider.getEmployee(id);
        return ResponseEntity.ok(employee);
    }

    @Override
    @GetMapping(path= "/update/{id}/{address}", produces = "application/json")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id, @PathVariable("address") String address) {
        Employee employee =  dummyDataProvider.updateEmployee(id, address);
        return ResponseEntity.ok(employee);
    }

    @Override
    @PostMapping(path= "/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee emp =  dummyDataProvider.createEmployee(employee);
        return ResponseEntity.ok(emp);
    }

    @Override
    @GetMapping(path="/delete/{id}", produces = "application/json")
    public ResponseEntity deleteEmployee(@PathVariable("id") Integer id) {
        dummyDataProvider.deleteEmployee(id);
       return ResponseEntity.ok("Successfully deleted");
    }
}
