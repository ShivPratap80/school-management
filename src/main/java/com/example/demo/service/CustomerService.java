package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Cacheable(cacheNames = "cutomerCache")
	public List<Customer> findAllCustomer() {
		return (List<Customer>)repository.findAll();
	}
	 
	@CacheEvict(cacheNames = {"cutomerCache"}, allEntries = true)
	public void clearCahe() {
		
	}


}
