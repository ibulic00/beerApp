package com.ivanTest.lombok.controller;


import com.ivanTest.lombok.model.Customer;
import com.ivanTest.lombok.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {


    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> listCustomers(){
        return customerService.listCustomers();
    }

    @RequestMapping(value = "/{customerId}",method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("customerId") UUID customerId){
     return  customerService.getCustomerById(customerId);
    }

}