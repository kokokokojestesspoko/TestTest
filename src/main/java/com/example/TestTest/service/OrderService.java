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

    /**
     * really
     * @param jahre Jahre
     * @return  sum of the all rows
     */
    public double totalRealisierterUmfangInEuro(int jahre) {

        double value = 0;
        for (Auftrag auftrag : auftragRepository.findAllByAuftragRealisiertAmIsGreaterThanEqual(last10(jahre))) {
            value += auftrag.getRealisierterUmfangInEuro();
        }
        return value;
    }

    public MoneyOverview calculate(int jahre) {
        MoneyOverview overview = new MoneyOverview(0, 0, 0);

        double umfangPerTagInEuro = (totalRealisierterUmfangInEuro(jahre) / (jahre * 365));
        overview.setUmfangPerTagInEuro(umfangPerTagInEuro);
        double umfangPerMonatInEuro = (totalRealisierterUmfangInEuro(jahre) / (jahre * 12));
        overview.setUmfangPerMonatInEuro(umfangPerMonatInEuro);
        double umfangPerJahrInEuro = (totalRealisierterUmfangInEuro(jahre) / jahre);
        overview.setUmfangPerJahrInEuro(umfangPerJahrInEuro);
        return overview;
    }

    public List<Auftrag> ShowAll() {
        return auftragRepository.findAll();
    }

    public List<Auftrag> last10Years(LocalDate date) {

        return auftragRepository.findAllByAuftragRealisiertAmIsGreaterThanEqual(date);
    }

    public List<Auftrag> byId(int kundeNummer) {
        return auftragRepository.findByKundenNr(kundeNummer);
    }

    public LocalDate last10(int jahre) {

        LocalDate startingDate = LocalDate.now();
        return startingDate.minus(jahre, ChronoUnit.YEARS);
    }

}






