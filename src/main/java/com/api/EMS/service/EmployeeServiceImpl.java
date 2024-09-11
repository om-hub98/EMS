package com.api.EMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.EMS.entity.Employee;
import com.api.EMS.repo.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
   
	@Autowired
	private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
    	log.info("Inside save employee method of the Employee Service");
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.getById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Integer id, Employee emp) {
    	Employee updatedEmployee = getEmployeeById(id);
    	updatedEmployee.setFirstName(emp.getFirstName());
    	updatedEmployee.setLastName(emp.getLastName());
    	updatedEmployee.setAge(emp.getAge());
    	updatedEmployee.setSalary(emp.getSalary());
    	updatedEmployee.setDesignation(emp.getDesignation());
    	updatedEmployee.setDateOfJoining(emp.getDateOfJoining());
        return saveEmployee(updatedEmployee);       
    }

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
}
