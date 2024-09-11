package com.api.EMS.service;

import java.util.List;

import com.api.EMS.entity.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Integer id, Employee employee);
	boolean deleteEmployee(Integer id);
}
