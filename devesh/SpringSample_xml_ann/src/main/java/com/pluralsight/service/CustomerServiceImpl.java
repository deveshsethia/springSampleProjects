package com.pluralsight.service;

import com.pluralsight.repository.CustomerRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.*;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	

	private CustomerRepository customerRepository ;
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {

       System.out.println("constructor");
		this.customerRepository = customerRepository;
	}
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
    @Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
