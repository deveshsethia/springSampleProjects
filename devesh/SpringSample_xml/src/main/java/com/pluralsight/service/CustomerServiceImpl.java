package com.pluralsight.service;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepository;
import java.util.List;
import com.pluralsight.model.*;
public class CustomerServiceImpl implements CustomerService {
	
	

	private CustomerRepository customerRepository1;
	public CustomerServiceImpl() {
		System.out.println("Default is called");
	}
	public CustomerServiceImpl(CustomerRepository customerRepository4) {
		
		this.customerRepository1 = customerRepository4;
		
		System.out.println("Parameter is called");
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository1.findAll();
	}
	
	public void setCustomRepository(CustomerRepository customerRepository) {
		this.customerRepository1 = customerRepository;
	}

	
}
