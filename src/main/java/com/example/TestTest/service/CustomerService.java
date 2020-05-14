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

    /**
     * method to find all data from table Kunden and order it by desc by the amount of orders
     *
     * @return the sorted Table Kunden
     */
    public List<Overview> getData() {
        List<Overview> result = new ArrayList<>();
        for (Kunden kunden : kundenRepository.findAll()) {
            result.add(from(kunden));
        }
        result.sort(Comparator.comparingInt(Overview::getNumberOfOrders));

        return result;
    }

    /**
     * finds all customers which have no order placed
     *
     * @return returns the table with these customers from table Kunden
     */
    public List<Kunden> allCustomersWithoutOrder() {
        return kundenRepository.noAuftrag();
    }

    /**
     * finds the customers without emailadress
     *
     * @return the list of customers from table Kunden
     */
    public List<Kunden> allCustomersWithEmail() {
        return kundenRepository.findAllByNotEmptyEmail();
    }

    /**
     * finds the customers with emailadress and at least one phoneNo, or FestnetzNo.
     *
     * @return the list of customers from table Kunden
     */
    public List<Kunden> allCustomersWithEmailAndPhone() {
        return kundenRepository.findWithEmailAndPhone();
    }

    private static Overview from(Kunden kunden) {
        return new Overview(createAddressFrom(kunden), kunden.getKundeNr(), kunden.getAuftrags().size());
    }

    /**
     * creates adress for Table Kunden
     *
     * @return combined fields to create adress of the customer
     */
    private static String createAddressFrom(Kunden kunden) {
        return kunden.getName() + " " + kunden.getStrasse();
    }

    /**
     * finds all customers.
     *
     * @return table with all records from table Kunden
     */
    public List<Kunden> getList() {
        return kundenRepository.findAll();
    }

    /**
     * finds the customers by the Customer Id
     * param kundeNummer is the customer id declared by the user in URL
     *
     * @return all data of the customer from tabel Kunden
     */
    public List<Kunden> byId(Integer kundeNummer) {
        return kundenRepository.findByKundeNr(kundeNummer);
    }
}
