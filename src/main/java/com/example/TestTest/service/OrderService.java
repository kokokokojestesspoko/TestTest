package com.example.TestTest.service;

import com.example.TestTest.model.Auftrag;

import com.example.TestTest.model.Overview;
import com.example.TestTest.repo.AuftragRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.sampled.AudioInputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    AuftragRepository auftragRepository;

    public List<Overview> getDataOrders() {
        List<Overview> result = new ArrayList<>();
        for (Auftrag a : auftragRepository.findAll()) {
            result.add(from(a));

        }
        return result;
    }
        private static Overview from(Auftrag a) {
            return new Overview(a.getAuftragsNr(),
                    a.getKurzbeschreibung());
        }
        public List<Auftrag> ShowAll(){
            return auftragRepository.findAll();
        }
        public List<Auftrag> byId(int kundeNummer)
        {
            return auftragRepository.findByKundenNr( kundeNummer);
        }

        }



