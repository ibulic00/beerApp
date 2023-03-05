package com.ivanTest.springMVC.services;

import com.ivanTest.springMVC.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {


    HashMap<UUID, CustomerDTO> customerHashMap;

    public CustomerServiceImpl() {
        customerHashMap = new HashMap<>();

        CustomerDTO customer1 = CustomerDTO.builder()
                .name("Ivan")
                .id(UUID.randomUUID())
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        CustomerDTO customer2 = CustomerDTO.builder().name("Ante")
                .id(UUID.randomUUID())
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        CustomerDTO customer3 = CustomerDTO.builder().name("Mate")
                .id(UUID.randomUUID())
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        customerHashMap.put(customer1.getId(), customer1);
        customerHashMap.put(customer2.getId(), customer2);
        customerHashMap.put(customer3.getId(), customer3);
    }

    @Override
    public List<CustomerDTO> listCustomers() {
        return new ArrayList<>(customerHashMap.values());
    }

    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return customerHashMap.get(id);
    }

    @Override
    public CustomerDTO createNewCustomer(CustomerDTO customer) {

        CustomerDTO newCustomer = CustomerDTO
                .builder()
                .id(UUID.randomUUID())
                .name(customer.getName())
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        customerHashMap.put(newCustomer.getId(), newCustomer);

        return newCustomer;

    }
}
