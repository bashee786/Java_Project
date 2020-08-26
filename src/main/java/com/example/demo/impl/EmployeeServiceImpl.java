package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.exapmle.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRep;

	@Override
	public Employee createEmployee(Employee e) {

		return employeeRep.save(e);
	}

	@Override
	public Employee updateEmployeeById(int id, Employee emp) {

		Employee updateEmp = employeeRep.updateEmployeeById(id);
		return updateEmp;
	}

	@Override
	public boolean deleteEmployeeById(int id) {

		employeeRep.deleteById(id);
		return true;

	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> getEmp = employeeRep.findById(id);
		if (getEmp.isPresent()) {
			Employee getData = getEmp.get();

			return getData;
		}
		return null;
	}

	@Override
	public List<Employee> getEmployees() {

		return employeeRep.findAll();
	}

}
