package net.codejava.services;

import java.util.List;

import net.codejava.entity.Customer;

public interface CustomerService {
	public abstract Customer createCustomer(Customer Customer);
	public abstract List<Customer> getAllCustomer();
	public abstract Customer getCustomer(String id);
	public abstract Boolean deleteCustomer(String id);
	public abstract Customer updateCustomer(String id,Customer Customer);
}
