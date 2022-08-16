package com.westpac.Westpac.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westpac.Westpac.dao.westpacDao;
import com.westpac.Westpac.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private westpacDao WestpacDao;
	
	//List<Customer> list;
	public CustomerServiceImpl() {
//		list =new ArrayList<>();
//		list.add(new Customer(1,"mihir",964405859));
//		list.add(new Customer(2,"rajesh",982605926));
//		list.add(new Customer(3,"monica",992605859));
	}

	@Override
	public List<Customer> getDetails() {
		
		return WestpacDao.findAll();
	}
	@Override
	public Customer getDetail(int Id) {
		
		
//		Customer c=null;
//		for(Customer Customer:list)
//		{
//			if(Customer.getId() == Id)
//			{
//				c=Customer;
//				break;
//			}
//		}
		return WestpacDao.getOne(Id);
	}

	@Override
	public Customer addCustomer(Customer customer) {
	//	list.add(customer);
		WestpacDao.save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
//		list.forEach(e ->{
//		if (e.getId() == customer.getId()) {
//			e.setName(customer.getName());
//			e.setNumber(customer.getNumber());
//			
//		}
//	});
		
		WestpacDao.save(customer);
		return customer;

}



//	@Override
//	public  Customer deleteCustomer(int Id) {
////		Customer d=null;
////		for(Customer Customer:list)
////		{
////			if(Customer.deleteCustomer() == Id)
////			{
////				d=Customer;
////				break;
////			}
////		
//	Customer entity = WestpacDao.getOne(Id);
//	WestpacDao.delete(entity);
//		return Id;
}



