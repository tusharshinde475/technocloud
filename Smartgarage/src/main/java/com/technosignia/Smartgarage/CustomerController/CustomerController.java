package com.technosignia.Smartgarage.CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.Smartgarage.CustomerEntity.Customer;
import com.technosignia.Smartgarage.CustomerService.CustomerService;

@RestController
public  class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@PostMapping("/customer")
	public  Customer createCustomer (@RequestBody Customer cust) {
	return customerService.createCustomer(cust);
		}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Long id ) {
		Customer customerByIdCustomer=customerService.getCustomerbyID (id);
		return customerByIdCustomer;
	}
	
	}

	
