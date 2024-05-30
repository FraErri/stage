package com.example.demo.services.impl;

import com.example.demo.entity.Pallet;
import com.example.demo.repository.PalletRepo;
import com.example.demo.services.PalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PalletServiceimpl implements PalletService {
    //private static Map<String, Pallet> PalletRepo = new HashMap<>();

    @Autowired
    PalletRepo palletRepo;

    @Override
    public long createPallet(Pallet pallet, long customerId) {


        palletRepo.save(pallet);
        return pallet.getId();
    }

    @Override
    public void updatePallet(long id, Pallet pallet) {

    }

    @Override
    public void deletePallet(Pallet pallet) {

    }

    @Override
    public Collection<Pallet> getPallet() {
        return null;
    }

    @Override
    public String addpallet(long shipmentId) {
        return "";
    }
}
