package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee e);
	public Employee updateEmployeeById(int id,Employee emp);
	public boolean deleteEmployeeById(int id);

	public Employee getEmployeeById(int id);
	public List<Employee> getEmployees();
}
