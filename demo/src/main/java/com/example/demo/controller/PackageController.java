package com.example.demo.controller;

import com.example.demo.entity.Package;
import com.example.demo.services.impl.PackageServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/package")
public class PackageController {
    @Autowired
    PackageServiceimpl packageService;

    //Aggiunge un package al pallet indicato, l’endpoint deve permettere di specificare la descrizione e il peso. Se il pallet è già
    //completo (verificare il camp max_packages) l’endpoint deve restituire un errore
    @PostMapping("/pallet/{palletId}")
    public long addPackage(@PathVariable long palletId, @RequestBody Package pack){
        return packageService.createPackage(pack, palletId);

    }

    //Restituisce l’elenco dei package associati ad un pallet
    @GetMapping("/byPallettId/{palletId}")
    public Iterable<Package> getAllPackages(@PathVariable long palletId){

        return packageService.getPackages(palletId);
    }

}
