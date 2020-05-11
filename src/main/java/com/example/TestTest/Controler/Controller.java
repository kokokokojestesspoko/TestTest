package com.example.TestTest.Controler;

import com.example.TestTest.AuftragRepository;
import model.Auftrag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class Controller  {

    @Autowired
    AuftragRepository auftragRepository;



@GetMapping("/Auftrage")
    public List<Auftrag> index(){
    return auftragRepository.findAll();
}
    @GetMapping("/Auftrag/{kundeNummer}")
    public List<Auftrag> show(@PathVariable String kundeNummer){
        int getkundeNummer  = Integer.parseInt(kundeNummer);
        return auftragRepository.findByKundenNr(getkundeNummer);
    }
}
