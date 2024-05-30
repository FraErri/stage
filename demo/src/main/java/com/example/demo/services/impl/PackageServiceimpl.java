package com.example.demo.services.impl;

import com.example.demo.entity.Package;
import com.example.demo.repository.PackageRepo;
import com.example.demo.services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageServiceimpl implements PackageService {

    @Autowired
    PackageRepo packageRepo;

    @Override
    public long createPackage(Package pack, long palletId) {
        pack.setPalletId(palletId);
        packageRepo.save(pack);
        return pack.getId();
    }

    @Override
    public void updatePackage(long id, Package pack) {

    }

    @Override
    public void deletePackage(Package pack) {

    }

    @Override
    public Iterable<Package> getPackages(long palletId) {

        return packageRepo.findByPalletId(palletId);
    }

    @Override
    public void addPackage(long palletId) {

    }

}
