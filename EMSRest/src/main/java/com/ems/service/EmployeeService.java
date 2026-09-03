package com.ems.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	public Employee searchEmployee(Integer id) {
		return repository.findById(id).orElse(new Employee());
	}

	public void deleteEmployee(Integer id) {
		repository.deleteById(id);
	}

}
