package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Customer;
import com.restaturant.api.booking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Boolean authUser(String email,String password)
    {
        Optional<Customer> customerOptional = customerRepository.findByCustomerEmailAndCustomerPassword(email,password);
        if(customerOptional.isPresent()){
            return true;

        }
        return false;
    }

    public List<Customer> getAllcustomer() {
        return (List<Customer>) customerRepository.findAll();


    }

    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    public Customer getAllcustomerById(Long id) {

        return customerRepository.findById(id).get();
    }

    public Customer createcustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }


    public Customer updatecustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}


