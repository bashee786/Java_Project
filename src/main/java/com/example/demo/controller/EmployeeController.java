package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Employee;
import com.example.demo.impl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employee;

	@GetMapping("/get/data")
	public List<Employee> getEmployees() {
		return employee.getEmployees();

	}

	@GetMapping("get/data/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {

		return employee.getEmployeeById(id);

	}

	@PostMapping("create/data")
	public boolean createEmployee(Employee emp) {

		employee.createEmployee(emp);
		return true;

	}
}
