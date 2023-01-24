package com.technosignia.Smartgarage.CustomerService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.Smartgarage.CustomerEntity.Customer;
import com.technosignia.Smartgarage.dao.CustomerRepository;

@Service
public  class CustomerService {
	
	
	@Autowired
	static
	CustomerRepository customerRepository;
	
	
	public  Customer createCustomer (Customer cust) {
	return customerRepository.save(cust);
}

	public Customer getCustomerbyID(Long id) {
		Customer customer;
	
		 customer =customerRepository.findById(id).get() ;	
		 
		 return customer;
		 
	}

	public static Customer updateCustomerDetails(Long id, Customer cust) {
		Customer ById = customerRepository.findById(id).get();
		cust.setName(cust.getName());
		ById.setAddress(cust.getAddress());
		ById.setContact(cust.getContact());
		ById.setEmail(cust.getEmail());
		Customer save = customerRepository.save(ById);
		return save;
	}

	public static String  deleteCustomerById(Long id) {
		Customer customer =(customerRepository.findById(id).get());
		customerRepository.delete(customer);
		return "record deleted Successfully completed";	
		}

}