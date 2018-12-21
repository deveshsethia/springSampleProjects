package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.*;
@Repository("customerRepository")
public class HibernateCustomerRepository implements CustomerRepository {
	List<Customer> customers= new ArrayList<>();
@Override
public List<Customer> findAll(){

	return customers;
}

public void addCustomer(Customer customer) {
	customers.add(customer)	;
}
}
