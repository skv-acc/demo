package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Employee;
import com.example.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	public String saveEmp(Employee e) {
		repo.save(e);
		return "save emp id with " + e.getId();
	}

	public Employee getEmployee(int id) {
		Employee employee = repo.getById(1);
		return employee;

	}
}
