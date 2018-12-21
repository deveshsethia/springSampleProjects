package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.*;

public class HibernateCustomerRepository2 implements CustomerRepository {
	
@Override
public List<Customer> findAll(){
	List<Customer> customers= new ArrayList<>();
	Customer customer = new Customer();
	customer.setFirstname("kd");
	customer.setLastname("");
	customers.add(customer);
	return customers;
}
}
