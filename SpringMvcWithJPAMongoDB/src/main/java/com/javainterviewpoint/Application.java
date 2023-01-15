package com.javainterviewpoint;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeDaoImpl employeeDaoImpl = (EmployeeDaoImpl) context.getBean("employeeDaoImpl");

		// new Application().mongoRepository();

//		// Create Employee
		Employee employee1 = new Employee("Tom", "Jerry");
		employeeDaoImpl.createEmployee(employee1);

		// Get Employee by FirstName
//		Employee employee2 = employeeDaoImpl.getEmployeeByFirstName("Tom");
//		System.out.println("*** Get Employee By FirstName ***");
//		System.out.println("First Name : " + employee2.getFirstname());
//		System.out.println("Last  Name : " + employee2.getLastname());

		// Get all Employees
		List<Employee> employeeList = employeeDaoImpl.getAllEmployees();
		System.out.println("*** Get All Employees ***");
		for (Employee emp : employeeList) {
			System.out.println("Emp Id : " +emp.getId());
			System.out.println("First Name : " + emp.getFirstname());
			System.out.println("Last  Name : " + emp.getLastname());
			System.out.println("#######################################");
		}

		// Update Employee - Read from DB and Update the Employee
		Employee employee3 = employeeDaoImpl.getEmployeeById("62e2cb332a3a5404dc011e25");
		employee3.setLastname("Jonny");
		employeeDaoImpl.updateEmployee(employee3);
		
		List<Employee> employeeList1 = employeeDaoImpl.getAllEmployees();
		System.out.println("*** Get All Employees ***");
		for (Employee emp : employeeList1) {
			System.out.println("Emp Id : " +emp.getId());
			System.out.println("First Name : " + emp.getFirstname());
			System.out.println("Last  Name : " + emp.getLastname());
			System.out.println("#######################################");
		}
//
//		// Delete Employee
//		employeeDaoImpl.deleteEmployee("5d3ecb690594262d20a96e6e");
//
//		context.close();
	}
}