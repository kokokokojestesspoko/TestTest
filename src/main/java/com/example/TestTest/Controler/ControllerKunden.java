package com.example.TestTest.Controler;


import com.example.TestTest.KundenRepository;
import com.example.TestTest.model.Kunden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ControllerKunden {

    @Autowired
          KundenRepository kundenRepository;



        @GetMapping("/Kunden")
        public List<Kunden> index(){
            return kundenRepository.findAll();
        }
        @GetMapping("/Kunden/{kundeNummer}")
        public List<Kunden> show(@PathVariable String kundeNummer){
            int getkundeNummer  = Integer.parseInt(kundeNummer);
            return kundenRepository.findByKundeNr(getkundeNummer);
        }
    }


