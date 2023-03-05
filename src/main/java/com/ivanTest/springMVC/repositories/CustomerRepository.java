package com.ivanTest.springMVC.repositories;

import com.ivanTest.springMVC.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
