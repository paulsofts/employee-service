package com.paulsofts.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulsofts.employeeservice.model.Employee;
import com.paulsofts.employeeservice.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.employeeServiceImpl.createEmployee(employee);
	}
	
	@GetMapping("/get")
	public List<Employee> getAllEmployee(){
		return this.employeeServiceImpl.getEmployees();
	}

}
