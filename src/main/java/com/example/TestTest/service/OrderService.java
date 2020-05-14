package com.example.TestTest.service;

import com.example.TestTest.model.Auftrag;

import com.example.TestTest.model.MoneyOverview;
import com.example.TestTest.model.Overview;
import com.example.TestTest.repo.AuftragRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    AuftragRepository auftragRepository;

    //**
//    public List<Overview> getDataOrders() {
//        List<Overview> result = new ArrayList<>();
//        for (Auftrag a : auftragRepository.findAll()) {
//            result.add(from(a));
//
//        }
//        return result;
//    }
//        private static MoneyOverview from(Auftrag a) {
//            return new MoneyOverview();
//        } **//
    public List<Auftrag> ShowAll() {
        return auftragRepository.findAll();
    }
    public List<Auftrag> last10Years(LocalDate date){
       return auftragRepository.findAllByAuftragRealisiertAmIsGreaterThanEqual(date);
    }

    public List<Auftrag> byId(int kundeNummer) {
        return auftragRepository.findByKundenNr(kundeNummer);
    }

    public LocalDate last10() {

        LocalDate startingDate = LocalDate.now();
        return startingDate.minus(10, ChronoUnit.YEARS);
    }


    //**   public List<MoneyOverview> getLast10Years() {
    //        List<Overview> result = new ArrayList<>();
    //        for (Auftrag auftrag : auftragRepository.findAll()) {
    //            result.add(from(kunden));
    //        }**//

    }




