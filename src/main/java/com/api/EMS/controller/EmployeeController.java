package com.api.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.EMS.entity.Employee;
import com.api.EMS.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		log.info("Inside save employee method of the Employee controller");
		return employeeService.saveEmployee(employee);	
	}
	@GetMapping("/")
	public List<Employee> getAllEmployee(){
		log.info("Inside get all employee method of the Employee controller");
		return employeeService.getAllEmployees();
	}
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Integer id){
		log.info("Inside get employee method of the Employee controller");
		return employeeService.getEmployeeById(id);
	}
}
