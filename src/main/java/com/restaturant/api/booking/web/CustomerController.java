package com.restaturant.api.booking.web;


import com.restaturant.api.booking.model.Customer;
import com.restaturant.api.booking.repository.CustomerRepository;
import com.restaturant.api.booking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value="/customers",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List< Customer > getCustomer() {
        return (List<Customer>) customerService.getAllcustomer();
    }

    @CrossOrigin
  @RequestMapping(value="/customers",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer ){
        Customer createCustomer = customerService.createCustomer (customer);
        return Optional.ofNullable(createCustomer)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
   }
    @RequestMapping(value="/customers/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Customer  getCustomerById(@PathVariable Long id) {
        return  customerService.getAllcustomerById(id);

    }
    @CrossOrigin
    @RequestMapping(value = "/customers/login",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Boolean checkCustomer(@RequestBody Customer customer){
        return customerService.authUser(customer.getCustomerEmail(),customer.getCustomerPassword());
    }
    @CrossOrigin
   @RequestMapping(value="/customers",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> updatecustomer(@RequestBody Customer customer ){
        Customer createCustomer = customerService.updatecustomer (customer);
        return Optional.ofNullable(createCustomer)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @CrossOrigin
    @RequestMapping(value = "/customers/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable Long id)
    {
        customerService.deleteById(id);
    }

    @CrossOrigin
    @RequestMapping(value="/customers/email/get",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Optional<Customer> login(@RequestBody Customer customer){
        return customerRepository.findByCustomerEmail(customer.getCustomerEmail());
    }


}
