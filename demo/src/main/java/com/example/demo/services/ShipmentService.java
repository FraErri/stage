package com.example.demo.services;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Shipment;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface ShipmentService {
    public long createShipment(long clientId, Shipment shipment);
    public void updateShipment(long id, Shipment shipment);
    public void deleteShipment(Shipment shipment);
    public Collection<Shipment> getAllShipment();
    public Collection<Shipment> getShipments(long clientId);
    public void closeShipment();
}
