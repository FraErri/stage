package com.example.demo.services;

import com.example.demo.entity.Package;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface PackageService {
    public long createPackage(Package pack, long palletId);
    public void updatePackage(long id, Package pack);
    public void deletePackage(Package pack);
    public Iterable<Package> getPackages(long palletId);
    public void addPackage(long palletId);
}
