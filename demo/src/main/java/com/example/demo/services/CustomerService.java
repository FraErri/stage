package com.example.demo.services;

import com.example.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface CustomerService {
    public long createCustomer(Customer customer);
    public void updateCustomer(long id, Customer customer);
    public void deleteCustomer(Customer customer);
    public Iterable<Customer> getCustomers();
    public Customer getCustomer(long id);
}
