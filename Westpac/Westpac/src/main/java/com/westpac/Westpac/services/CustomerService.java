package com.westpac.Westpac.services;

import java.util.List;

import com.westpac.Westpac.entity.Customer;

public interface CustomerService {
	public List<Customer> getDetails();
	public Customer getDetail(int Id);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	//public Customer deleteCustomer(int Id);
}
