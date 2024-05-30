
package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import com.example.demo.utility.ShipmentState;
import org.springframework.data.repository.CrudRepository;

import  com.example.demo.entity.Package;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepo extends CrudRepository<Package, Long> {

    List<Package> findByPalletId (long palletId);

    Package findById(long id);


}
