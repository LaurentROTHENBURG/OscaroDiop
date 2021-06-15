package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.Customer;
import com.example.oscarodiop.models.PartType;
import com.example.oscarodiop.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")

public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getCustomerAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isPresent()) {
            return customer.get();
        } else {
            return null;
        }
    }

    @PostMapping
    public Long createCustomer(@RequestBody Customer customerToCreate) {
        return customerRepository.save(customerToCreate).getId();
    }

    @Transactional
    @PutMapping(value = "/custommer/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

}//end
