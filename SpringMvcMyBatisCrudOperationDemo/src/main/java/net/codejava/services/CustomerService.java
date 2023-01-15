package net.codejava.services;

import java.util.List;

import net.codejava.models.Customer;

public interface CustomerService {
	public abstract List<Customer> findAll();
	public abstract Customer findById(int id);
	public abstract boolean delete(int id);
	public abstract int updateCustomer(Customer customer);
	public abstract int saveCustomer(Customer customer);
}
