package com.example.demo.controller;

import com.example.demo.entity.Pallet;
import com.example.demo.services.PalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/pallet")
public class PalletController {

    @Autowired
    PalletService palletService;

    //Aggiunge un pallet ad un ordine indicato tramite ID. Nell’endpoint bisogna indicare il numero di max_packages e la sua descrizione. Restituisce l’id del pallet creato
    @PostMapping("/shipment/{shipmentId}")
    public long addPallet(@PathVariable long shipmentId, @RequestBody Pallet pallet){

        return palletService.createPallet(pallet, shipmentId);
    }


    //Restituisce l’elenco dei pallet associati ad un ordine
    @GetMapping("/byShipmentId/{shipmentId}")
    public Collection<Pallet> getAllPallet(@PathVariable long shipmentId){
        return palletService.getPallet();
    }

}
