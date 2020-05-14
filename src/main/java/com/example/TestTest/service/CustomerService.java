package com.example.TestTest.service;

import com.example.TestTest.model.Kunden;
import com.example.TestTest.model.Overview;
import com.example.TestTest.repo.KundenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private KundenRepository kundenRepository;

    public List<Overview> getData() {
        List<Overview> result = new ArrayList<>();
        for (Kunden kunden : kundenRepository.findAll()) {
            result.add(from(kunden));
        }
        result.sort(Comparator.comparingInt(Overview::getNumberOfOrders));

        return result;
    }

    public List<Kunden> allCustomersWithoutOrder() {
        return kundenRepository.noAuftrag();
    }

    public List<Kunden> allCustomersWithEmail() {
        return kundenRepository.findAllByNotEmptyEmail();
    }

    public List<Kunden> allCustomersWithEmailAndPhone() {
        return kundenRepository.findWithEmailAndPhone();
    }

    private static Overview from(Kunden kunden) {
        return new Overview(createAddressFrom(kunden), kunden.getKundeNr(), kunden.getAuftrags().size());
    }

    private static String createAddressFrom(Kunden kunden) {
        return kunden.getName() + " " + kunden.getStrasse();
    }

    public List<Kunden> getList() {
        return kundenRepository.findAll();
    }

    public List<Kunden> byId(Integer kundeNummer) {
        return kundenRepository.findByKundeNr(kundeNummer);
    }
}
