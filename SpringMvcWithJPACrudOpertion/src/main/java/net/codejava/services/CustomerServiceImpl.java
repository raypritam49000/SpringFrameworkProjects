package net.codejava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.entity.Customer;
import net.codejava.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository; 
	
	@Override
	public Customer createCustomer(Customer Customer) {
		return this.customerRepository.save(Customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return this.customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(String id) {
		return this.customerRepository.findById(id).get();
	}

	@Override
	public Boolean deleteCustomer(String id) {
		this.customerRepository.delete(customerRepository.findById(id).get());
		return true;
	}

	@Override
	public Customer updateCustomer(String id, Customer Customer) {
		Customer existCustomer = this.customerRepository.findById(id).get();
		Customer updateCustomer = null;
		if(existCustomer!=null) {
		
			updateCustomer = this.customerRepository.save(existCustomer);
		}
		return updateCustomer;
	}

}
