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
     * Method to sum the all orders from the descripted period
     *
     * @param jahre the amount od years which will be used to calculate the "umfang"
     * @return summed rows "umfang" from last x years
     */
    public double totalRealisierterUmfangInEuro(int jahre) {

        double value = 0;
        for (Auftrag auftrag : auftragRepository.findAllByAuftragRealisiertAmIsGreaterThanEqual(last10(jahre))) {
            value += auftrag.getRealisierterUmfangInEuro();
        }
        return value;
    }

    /**
     * Method to calculate the umfang from last x years. It will be showed in years, months and days.
     *
     * @param jahre years declared by the user in URL
     * @return returs 3 variables. the summary for days, months and years
     */
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

    /**
     * Shows all from the Table aufrag
     *
     * @return the whole table
     */
    public List<Auftrag> ShowAll() {
        return auftragRepository.findAll();
    }

    /**
     * method to get all inputs from table Auftrag from last 10 years
     *
     * @param date is setting the period of 10 years
     * @return the whole table Auftrag with data from last 10 years
     */
    public List<Auftrag> last10Years(LocalDate date) {

        return auftragRepository.findAllByAuftragRealisiertAmIsGreaterThanEqual(date);
    }

    /**
     * Method to find the orders by the customer id
     *
     * @param kundeNummer customer id declared by the user in URL
     * @return the table with results
     */
    public List<Auftrag> byId(int kundeNummer) {
        return auftragRepository.findByKundenNr(kundeNummer);
    }

    /**
     * method to set the date back from current date
     *
     * @param jahre Parameter which declares how many years should be substracted, declared by the user in Url
     * @return the date after substraction
     */
    public LocalDate last10(int jahre) {

        LocalDate startingDate = LocalDate.now();
        return startingDate.minus(jahre, ChronoUnit.YEARS);
    }

}






