package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
 
	@PostMapping("/save")
	public String saveEmp(Employee e) {
		return service.saveEmp(e);
		
	}

	@GetMapping("/find/{id}")
	public Employee getEmployee(@PathVariable int id) {
		
		return service.getEmployee(id);

	}
}
