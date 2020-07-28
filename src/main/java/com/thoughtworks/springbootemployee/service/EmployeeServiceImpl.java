package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployee {

    private List<Employee> employeeList = new ArrayList<>();

    //selectAll
    @Override
    public List<Employee> selectAllEmployee() {
        return employeeList;
    }

    //selectEmployeeById
    @Override
    public Employee selectEmployeeById(int id) {
        return employeeList.stream().filter(employee -> employee.getId() == id).findFirst().get();
    }

    //add
    @Override
    public boolean addEmployee(Employee employee) {
        return employeeList.add(employee);
    }

    //delete
    @Override
    public boolean deleteEmployeeById(int id) {
        return employeeList.removeIf(employee -> employee.getId() == id);
    }

    //update
    @Override
    public boolean updateEmployee(Employee employee) {
        // TODO : objectMap
        Employee  oldEmployee = employeeList.stream().filter(e -> e.getId() == employee.getId()).findFirst().get();
        oldEmployee.setAge(employee.getAge());
        oldEmployee.setGender(employee.getGender());
        oldEmployee.setName(employee.getName());
        return true;
    }
}
