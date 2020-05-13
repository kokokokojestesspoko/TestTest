package com.example.TestTest.Controler;


import com.example.TestTest.repo.KundenRepository;
import com.example.TestTest.model.Kunden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ControllerKunden {

    @Autowired
          KundenRepository kundenRepository;


    @GetMapping("/Kunden")
    public List<Kunden> index(@RequestParam(value = "emailcheck", required = false) boolean emailCheck,@RequestParam(value = "emailphonecheck", required = false)
            boolean emailPhoneCheck,@RequestParam(value="noauftrag",required = false) boolean noAuftrag){
        if(noAuftrag)
        {
            return kundenRepository.noAuftrag();
        }
        if (emailCheck) {
            return kundenRepository.findAllByNotEmptyEmail();
        }
        else if (emailPhoneCheck)
        {
            return kundenRepository.findWithEmailAndPhone();
        }
        return kundenRepository.findAll();
    }
       @GetMapping("/Kunden/{kundeNummer}")
        public List<Kunden> show(@PathVariable Integer kundeNummer){

            return kundenRepository.findByKundeNr(kundeNummer);
        }




    }



