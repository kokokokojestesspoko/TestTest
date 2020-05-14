package com.example.TestTest.model;

import java.time.LocalDate;
import java.util.Date;

public class MoneyOverview {
    private double umfangPerTagInEuro;
    private double umfangPerMonatInEuro;
    private double umfangPerJahrInEuro;
    private LocalDate auftragRealisiertAm;
    private double RealisiersterUmfang;

    public MoneyOverview(LocalDate auftragRealisiertAm, double realisiersterUmfang) {
        this.auftragRealisiertAm = auftragRealisiertAm;
        RealisiersterUmfang = realisiersterUmfang;
    }



    public double getUmfangPerTagInEuro() {
        return umfangPerTagInEuro;
    }

    public void setUmfangPerTagInEuro(double umfangPerTagInEuro) {
        this.umfangPerTagInEuro = umfangPerTagInEuro;
    }

    public double getUmfangPerMonatInEuro() {
        return umfangPerMonatInEuro;
    }

    public void setUmfangPerMonatInEuro(double umfangPerMonatInEuro) {
        this.umfangPerMonatInEuro = umfangPerMonatInEuro;
    }

    public double getUmfangPerJahrInEuro() {
        return umfangPerJahrInEuro;
    }

    public void setUmfangPerJahrInEuro(double umfangPerJahrInEuro) {
        this.umfangPerJahrInEuro = umfangPerJahrInEuro;
    }

    public LocalDate getAuftragRealisiertAm() {
        return auftragRealisiertAm;
    }

    public void setAuftragRealisiertAm(LocalDate auftragRealisiertAm) {
        this.auftragRealisiertAm = auftragRealisiertAm;
    }

    public double getRealisiersterUmfang() {
        return RealisiersterUmfang;
    }

    public void setRealisiersterUmfang(double realisiersterUmfang) {
        RealisiersterUmfang = realisiersterUmfang;
    }
}