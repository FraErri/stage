
package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Shipment;
import com.example.demo.utility.ShipmentState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepo extends CrudRepository<Shipment, Long> {

    List<Shipment> findByCustomerId(long customerId);

    List<Shipment> findByStatus(ShipmentState status);

    Shipment findById(long id);
}
