package com.ivanTest.springMVC.services;

import com.ivanTest.springMVC.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {


    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);

    Customer createNewCustomer(Customer customer);

}
