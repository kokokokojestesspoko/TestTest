package com.example.TestTest.Controler;

import com.example.TestTest.model.Kunden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.TestTest.model.Overview;
import com.example.TestTest.service.CustomerService;


import java.util.List;

@RestController
public class ControllerKunden {

    @Autowired
    CustomerService customerService;
    @GetMapping("/overview")
    public List<Overview> allOverview() {
        return customerService.getData();
    }
    @GetMapping("/Kunden")
    public List<Kunden> index(@RequestParam(value = "emailcheck", required = false) boolean emailCheck, @RequestParam(value = "emailphonecheck", required = false)
            boolean emailPhoneCheck, @RequestParam(value = "noauftrag", required = false) boolean noAuftrag) {
        if (noAuftrag) {
            return customerService.allCustomersWithoutOrder();
        }
        if (emailCheck) {
            return customerService.allCustomersWithEmail();
        } else if (emailPhoneCheck) {
            return customerService.allCustomersWithEmailAndPhone();
        }
        return customerService.getList();
    }
    @GetMapping("/Kunden/{kundeNummer}")
    public List<Kunden> show(@PathVariable Integer kundeNummer) {

        return customerService.byId(kundeNummer);
    }
}

// CONTROLLER <- (DTO) -> SERVICES  <- (ENTITIES) -> REPOSITORIES

