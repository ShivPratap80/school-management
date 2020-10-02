package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	 
	@GetMapping("/search")
	@CrossOrigin(origins = "http://localhost:4200")
	public @ResponseBody List<Customer> search() {
		return (List<Customer>)service.findAllCustomer();
	}
	
	
	@GetMapping("/clear")
	@CrossOrigin(origins = "http://localhost:4200")
	public @ResponseBody String clear() {
		service.clearCahe();
		return "Success";
	}
}
