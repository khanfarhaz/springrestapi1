package com.springrest.springrestapi.services;

import java.util.List;

import com.springrest.springrestapi.entities.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	
	public Employee addEmployee(Employee employee);

}
