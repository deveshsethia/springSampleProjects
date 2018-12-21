package com.pluralsight;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

    CustomerService customerservice= new CustomerServiceImpl();
    System.out .println(customerservice.findAll().get(0).getFirstname());
	}

}
