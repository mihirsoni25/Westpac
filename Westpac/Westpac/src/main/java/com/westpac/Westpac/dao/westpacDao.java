package com.westpac.Westpac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.westpac.Westpac.entity.Customer;

public interface westpacDao extends JpaRepository<Customer, Long> {

	Customer getOne(int id);

}
