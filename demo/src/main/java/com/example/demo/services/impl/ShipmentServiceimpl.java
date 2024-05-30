package com.example.demo.services.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepo;
import com.example.demo.services.ShipmentService;
import com.example.demo.utility.ShipmentState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ShipmentServiceimpl implements ShipmentService {
    //private static Map<String, Shipment> ShipmentRepo = new HashMap<>();

    @Autowired
    ShipmentRepo shipmentRepo;

    @Override
    public long createShipment(long customerId, Shipment shipment) {
        shipment.setCustomerId(customerId);
        shipmentRepo.save(shipment);
        return shipment.getId();
    }

    @Override
    public void updateShipment(long id, Shipment shipment) {

    }

    @Override
    public void deleteShipment(Shipment shipment) {

    }

    @Override
    public Collection<Shipment> getAllShipment() {

        return shipmentRepo.findByStatus(ShipmentState.OPEN);
    }

    @Override
    public Collection<Shipment> getShipments(long clientId) {

        return shipmentRepo.findByCustomerId(clientId);

    }

    @Override
    public void closeShipment() {
        //shipmentRepo.put
    }
}
