package com.paulsofts.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulsofts.employeeservice.model.Employee;
import com.paulsofts.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return this.employeeRepository.save(employee);

	}

	@Override
	public List<Employee> getEmployees() {

		return this.employeeRepository.findAll();
	}

}
