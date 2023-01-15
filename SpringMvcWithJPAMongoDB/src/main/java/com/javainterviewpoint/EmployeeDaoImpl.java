package com.javainterviewpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public void createEmployee(Employee employee) {
		//employeeRepository.insert(employee);
		employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeByFirstName(String firstname) {
		return employeeRepository.findByFirstname(firstname);
	}

	public Employee getEmployeeById(String id) {
		Optional<Employee> e = employeeRepository.findById(id);
		return e.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
}