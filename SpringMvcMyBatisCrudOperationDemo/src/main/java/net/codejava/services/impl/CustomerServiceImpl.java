package net.codejava.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.mapper.CustomerMapper;
import net.codejava.models.Customer;
import net.codejava.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> findAll() {
		return this.customerMapper.findAll();
	}

	@Override
	public Customer findById(int id) {
		return this.customerMapper.findById(id);
	}

	@Override
	public boolean delete(int id) {
		this.customerMapper.delete(id);
		return true;
	}

	@Override
	public int updateCustomer(Customer customer) {
		return this.customerMapper.updateCustomer(customer);
	}

	@Override
	public int saveCustomer(Customer customer) {
		return this.customerMapper.saveCustomer(customer);
	}

}
