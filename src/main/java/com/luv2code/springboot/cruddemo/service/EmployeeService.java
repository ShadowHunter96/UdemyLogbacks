package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findByID(int theId);
    Employee save(Employee employee);
    void deleteByID(int theId);

}
