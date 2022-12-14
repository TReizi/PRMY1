package com.spring.mvc.service;

import com.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);

    public Employee getEmployee(int id);
}
