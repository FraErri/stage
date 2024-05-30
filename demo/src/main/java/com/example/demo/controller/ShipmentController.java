package com.example.demo.controller;

import com.example.demo.entity.Shipment;
import com.example.demo.services.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/shipment")
public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    //Crea un ordine per un cliente indicato tramite uri (Ricordarsi che è necessario poter indicare una descrizione dell’ordine) e restituisce l’id associato
    @PostMapping("/client/{clientId}")
    public void createShipment(@PathVariable long clientId, @RequestBody Shipment shipment){

        shipmentService.createShipment(clientId, shipment);
    }

    //Aggiorna lo stato dell’ordine da Open a Closed
    @PatchMapping("/closeShipment")
    public String closeShipment(){

        shipmentService.closeShipment();
        return "";
    }


    //Restituisce l’elenco degli ordini aperti
    @GetMapping("/allOpenShipments")
    public Collection<Shipment> listAllShipments(){
        return shipmentService.getAllShipment();

    }



    //Restituisce l’elenco degli ordini per un determinato cliente
    @GetMapping("/byClientId/{clientID}")
    public Collection<Shipment> listShipments(@PathVariable long clientId){
        return shipmentService.getShipments(clientId);
    }

}
