
package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Pallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalletRepo extends CrudRepository<Pallet, Long> {

    Pallet findById(long id);
}
