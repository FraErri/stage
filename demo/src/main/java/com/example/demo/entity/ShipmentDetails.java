package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShipmentDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    long id_shipment;

    long id_pallet;

    public ShipmentDetails(long id_shipment, long id_pallet) {
        this.id_shipment = id_shipment;
        this.id_pallet = id_pallet;
    }

    public ShipmentDetails() {
    }

    public long getId_shipment() {
        return id_shipment;
    }

    public void setId_shipment(long id_shipment) {
        this.id_shipment = id_shipment;
    }

    public long getId_pallet() {
        return id_pallet;
    }

    public void setId_pallet(long id_pallet) {
        this.id_pallet = id_pallet;
    }

    @Override
    public String toString() {
        return "ShipmentDetails{" +
                "id_shipment=" + id_shipment +
                ", id_pallet=" + id_pallet +
                '}';
    }
}
