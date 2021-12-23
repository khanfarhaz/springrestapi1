package com.springrest.springrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrestapi.entities.Employee;
import com.springrest.springrestapi.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	List<Employee> list;
	public EmployeeServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Employee(100,"Farhaz",24,25000));
		list.add(new Employee(101,"khan",24,25000));
		
	}

	@Override
	public List<Employee> getEmployees() {
		
		return list;
	}

	@Override
	public Employee addEmployee(Employee employee)
	{
		list.add(employee);
		return employee;
	}

	
}
