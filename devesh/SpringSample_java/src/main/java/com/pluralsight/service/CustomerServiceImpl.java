package com.pluralsight.service;

import com.pluralsight.repository.CustomerRepository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.*;
@Service("customerService")
//@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
    
	private CustomerRepository customerRepository ;
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		
	}
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
    @Override
	public void addCustomer(Customer customer) {
		customerRepository.addCustomer(customer);
	}
	
}
