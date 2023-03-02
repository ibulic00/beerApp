package com.ivanTest.lombok.services;

import com.ivanTest.lombok.model.Beer;
import com.ivanTest.lombok.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {


    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);

}
