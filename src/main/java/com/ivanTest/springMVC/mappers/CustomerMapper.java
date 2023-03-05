package com.ivanTest.springMVC.mappers;


import com.ivanTest.springMVC.entities.Customer;
import com.ivanTest.springMVC.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

  Customer customerDtoToCustomer(CustomerDTO dto);

  CustomerDTO customerToCustomerDto(Customer customer);



}
