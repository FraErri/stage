package com.example.demo.services.impl;

import com.example.demo.entity.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerServiceimpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public long createCustomer(Customer customer){
        customerRepo.save(customer);
        return customer.getId();
    }

    @Override
    public void updateCustomer(long id, Customer customer) {
        //customerRepo.remove(id);
        customer.setId(id);
        //customerRepo.put(id, customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        //customerRepo.remove(id);
    }


    @Override
    public Iterable<Customer> getCustomers() {
        //customerRepo.values();
        return customerRepo.findAll();
    }

    @Override
    public Customer getCustomer(long id) {

        return customerRepo.findById(id);
    }

    public void insert(Customer customer){

        customerRepo.save(customer);
    }
}
