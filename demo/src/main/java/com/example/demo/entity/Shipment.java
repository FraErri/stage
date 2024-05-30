package com.example.demo.entity;

import com.example.demo.utility.ShipmentState;
import jakarta.persistence.*;

@Entity
@Table(name = "Shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    @Column(name="desc", nullable=true, unique=false)
    String desc;
    @Column(name="shipment_date", nullable=false, unique=false)
    String shipment_date;
    @Column(name="customerId", nullable=false, unique=false)
    long customerId;
    @Column(name="status", nullable=true, unique=false)
    ShipmentState status;

    public Shipment(long id, String desc, String shipment_date, long customerId) {
        this.id = id;
        this.desc = desc;
        this.shipment_date = shipment_date;
        this.customerId = customerId;
        this.status = ShipmentState.OPEN;
    }

    public Shipment() {
        id = 0;
        customerId = 0;
        status = ShipmentState.OPEN;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public ShipmentState getStatus() {
        return status;
    }

    public void setStatus(ShipmentState status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getShipment_date() {
        return shipment_date;
    }

    public void setShipment_date(String shipment_date) {
        this.shipment_date = shipment_date;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", shipment_date='" + shipment_date + '\'' +
                ", customerId=" + customerId +
                ", status=" + status +
                '}';
    }
}
