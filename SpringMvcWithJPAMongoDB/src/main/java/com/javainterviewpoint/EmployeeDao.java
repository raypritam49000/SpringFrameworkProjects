package com.javainterviewpoint;

import java.util.List;

public interface EmployeeDao {
	public void createEmployee(Employee employee);

	public Employee getEmployeeByFirstName(String firstname);

	public List<Employee> getAllEmployees();

	public void updateEmployee(Employee employee);

	public void deleteEmployee(String id);
}