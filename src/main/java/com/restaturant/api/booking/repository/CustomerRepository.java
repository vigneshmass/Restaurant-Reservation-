package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Customer;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer ,Long> {

    Optional<Customer> findByCustomerEmailAndCustomerPassword(String email, String password);
    Optional<Customer> findByCustomerEmail(String email);
}
