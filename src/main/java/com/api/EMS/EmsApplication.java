package com.api.EMS;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.EMS.entity.Employee;
import com.api.EMS.service.EmployeeService;
import com.api.EMS.service.EmployeeServiceImpl;

@SpringBootApplication
public class EmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
		
//		EmployeeService employeeService = new EmployeeServiceImpl();
//
//        // Create Employees
//        Employee emp1 = new Employee(1, "John", "Doe", 28, 50000, "Developer", "2020-01-01");
//        Employee emp2 = new Employee(2, "Jane", "Doe", 32, 60000, "Manager", "2018-05-15");
//
//        employeeService.saveEmployee(emp1);
//        employeeService.saveEmployee(emp2);
//
//        // Get All Employees
//        List<Employee> employees = employeeService.getAllEmployees();
//        employees.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));
//
//        // Update Employee
//        Employee updatedEmp = new Employee(2, "Jane", "Smith", 32, 65000, "Senior Manager", "2018-05-15");
//        employeeService.updateEmployee(2, updatedEmp);
//
//        // Delete Employee
//        employeeService.deleteEmployee(1);
	}

}