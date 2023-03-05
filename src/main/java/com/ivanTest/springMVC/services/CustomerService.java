package com.ivanTest.springMVC.services;

import com.ivanTest.springMVC.model.CustomerDTO;

import java.util.List;
import java.util.UUID;

public interface CustomerService {


    List<CustomerDTO> listCustomers();

    CustomerDTO getCustomerById(UUID id);

    CustomerDTO createNewCustomer(CustomerDTO customer);

}
