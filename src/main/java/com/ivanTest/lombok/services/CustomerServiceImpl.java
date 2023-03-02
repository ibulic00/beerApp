package com.ivanTest.lombok.services;

import com.ivanTest.lombok.model.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {


    HashMap<UUID, Customer> customerHashMap;

    public CustomerServiceImpl() {
        customerHashMap = new HashMap<>();

        Customer customer1 = Customer.builder()
                .customerName("Ivan")
                .id(UUID.randomUUID())
                .lastModifiedDate(LocalDate.now())
                .createdDate(LocalDate.now())
                .build();

        Customer customer2 = Customer.builder().customerName("Ante")
                .id(UUID.randomUUID())
                .lastModifiedDate(LocalDate.now())
                .createdDate(LocalDate.now())
                .build();

        Customer customer3 = Customer.builder().customerName("Mate")
                .id(UUID.randomUUID())
                .lastModifiedDate(LocalDate.now())
                .createdDate(LocalDate.now())
                .build();

        customerHashMap.put(customer1.getId(), customer1);
        customerHashMap.put(customer2.getId(), customer2);
        customerHashMap.put(customer3.getId(), customer3);
    }

    @Override
    public List<Customer> listCustomers() {
        return new ArrayList<>(customerHashMap.values());
    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerHashMap.get(id);
    }

    @Override
    public Customer createNewCustomer(Customer customer) {

        Customer newCustomer = Customer
                .builder()
                .id(UUID.randomUUID())
                .customerName(customer.getCustomerName())
                .createdDate(LocalDate.now())
                .lastModifiedDate(LocalDate.now())
                .build();

        customerHashMap.put(newCustomer.getId(), newCustomer);

        return newCustomer;

    }
}
