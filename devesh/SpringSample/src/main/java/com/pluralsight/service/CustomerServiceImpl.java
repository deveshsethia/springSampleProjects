package com.pluralsight.service;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepository;
import java.util.List;
import com.pluralsight.model.*;
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerrepository =new HibernateCustomerRepository();

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerrepository.findAll();
	}
	
}
