package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.*;
@Repository("customRepository")
public class HibernateCustomerRepository implements CustomerRepository {
	
@Override
public List<Customer> findAll(){
	List<Customer> customers= new ArrayList<>();
	Customer customer = new Customer();
	customer.setFirstname("Devesh");
	customer.setLastname("Sethia");
	customers.add(customer);
	return customers;
}
}
