package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.services.CustomerService;
import com.example.demo.services.impl.CustomerServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerServiceimpl customerService;

    //Crea nuovo cliente
    @PostMapping("/customer")
    public long createCustomer(@RequestBody Customer customer){

        return customerService.createCustomer(customer);
    }

    //DA METTERE di tipo Customer
    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable long customerId){

        return customerService.getCustomer(customerId);
    }


    @GetMapping("/all")
    public Iterable<Customer> listCustomers(){

        return customerService.getCustomers();
    }
}
