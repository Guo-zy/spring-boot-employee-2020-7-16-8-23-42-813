package com.thoughtworks.springbootemployee.service;

import java.util.List;

public interface IEmployee {

    //selectAll
    public List<com.thoughtworks.springbootemployee.entity.Employee> selectAllEmployee() ;

    //selectEmployeeById
    public com.thoughtworks.springbootemployee.entity.Employee selectEmployeeById(int id);

    //add
    public boolean addEmployee(com.thoughtworks.springbootemployee.entity.Employee employee);

    //delete
    public boolean deleteEmployeeById(int id) ;
    //update

    public boolean updateEmployee(com.thoughtworks.springbootemployee.entity.Employee employee);
}
