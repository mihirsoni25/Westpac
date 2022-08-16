package com.westpac.Westpac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.westpac.Westpac.entity.Customer;
import com.westpac.Westpac.services.CustomerService;


@RestController
public class WestpacController {
	@Autowired
public CustomerService customerService;
	@GetMapping("/Customer")
	public List<Customer> getDetails()
	{
		return this.customerService.getDetails();
	}
	
	@GetMapping("/Customer/{Id}")
	public Customer getDetails(@PathVariable int Id)
	{
		return this.customerService.getDetail(Id);
	}
	@PostMapping("/Customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return this.customerService.addCustomer(customer);
	}
	@PutMapping("/Customer")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return this.customerService.updateCustomer(customer);
	}
//	@DeleteMapping("/Customer/{Id}")
//	public Customer deleteCustomer(@PathVariable int Id)
//	{
//		return this.customerService.deleteCustomer(Id);
//	}
}
