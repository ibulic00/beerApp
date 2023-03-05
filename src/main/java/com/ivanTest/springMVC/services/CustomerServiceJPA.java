package com.ivanTest.springMVC.services;

import com.ivanTest.springMVC.mappers.CustomerMapper;
import com.ivanTest.springMVC.model.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Primary
@RequiredArgsConstructor
public class CustomerServiceJPA implements CustomerService {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;


    @Override
    public List<CustomerDTO> listCustomers() {
        return null;
    }

    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return null;
    }

    @Override
    public CustomerDTO createNewCustomer(CustomerDTO customer) {
        return null;
    }
}
