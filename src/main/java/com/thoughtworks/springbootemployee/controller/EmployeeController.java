package com.thoughtworks.springbootemployee.controller;


import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @GetMapping()
    public List<Employee> selectAllEmployees() {
        return employeeServiceImpl.selectAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee selectEmployeeById(@PathVariable int id) {
        return employeeServiceImpl.selectEmployeeById(id);
    }

    @PostMapping("")
    public boolean addEmployeeInfo(@RequestBody Employee employee) {
        return employeeServiceImpl.addEmployee(employee);
    }


    @DeleteMapping("/{id}")
    public boolean deleteEmployeeById(@PathVariable int id) {
        return employeeServiceImpl.deleteEmployeeById(id);
    }

    @PutMapping("")
    public boolean updateEmployee(@RequestBody Employee employee) {
        return employeeServiceImpl.updateEmployee(employee);
    }

}
