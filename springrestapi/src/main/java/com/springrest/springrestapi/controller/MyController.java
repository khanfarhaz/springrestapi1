package com.springrest.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrestapi.entities.Employee;
import com.springrest.springrestapi.services.EmployeeService;

@RestController
public class MyController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		
		return "This is home page";
	}

	@GetMapping(path= "/employees", produces= {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE}) 
			
	public List<Employee>getEmployees()
	{
		return this.employeeService.getEmployees();
	}
	@PostMapping( path= "/employees", consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
			
	public Employee addEmployee(@RequestBody Employee employee)
	
	{
		return this.employeeService.addEmployee(employee);
	}

}
