
package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

    //List<Customer> findByEmail(String email);

    Customer findById(long id);
}
