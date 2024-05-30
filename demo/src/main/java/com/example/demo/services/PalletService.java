package com.example.demo.services;

import com.example.demo.entity.Pallet;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface PalletService {

    public long createPallet(Pallet pallet, long customerId);
    public void updatePallet(long id, Pallet pallet);
    public void deletePallet(Pallet pallet);
    public Collection<Pallet> getPallet();
    public String addpallet(long shipmentId);
}
