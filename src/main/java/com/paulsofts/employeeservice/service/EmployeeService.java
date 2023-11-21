package com.paulsofts.employeeservice.service;

import java.util.List;

import com.paulsofts.employeeservice.model.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	public List<Employee> getEmployees();

}
