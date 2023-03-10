package com.ivanTest.springMVC.controller;


import com.ivanTest.springMVC.model.CustomerDTO;
import com.ivanTest.springMVC.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {


    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<CustomerDTO> listCustomers() {
        return customerService.listCustomers();
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public CustomerDTO getCustomerById(@PathVariable("customerId") UUID customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping
    public ResponseEntity addNewCustomer(@RequestBody CustomerDTO customer) {

        CustomerDTO newCustmer = customerService.createNewCustomer(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.add("newCustmer", "/api/v1/customer/" + newCustmer.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

}
