package com.example.TestTest.model;

import java.time.LocalDate;
import java.util.Date;

public class MoneyOverview {
    private double umfangPerTagInEuro;
    private double umfangPerMonatInEuro;
    private double umfangPerJahrInEuro;

    public MoneyOverview(double umfangPerTagInEuro, double umfangPerMonatInEuro, double umfangPerJahrInEuro) {
        this.umfangPerTagInEuro = umfangPerTagInEuro;
        this.umfangPerMonatInEuro = umfangPerMonatInEuro;
        this.umfangPerJahrInEuro = umfangPerJahrInEuro;
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

    @Override
    public String toString() {
        return "MoneyOverview{" +
                "umfangPerTagInEuro=" + umfangPerTagInEuro + " Euro" +
                ", umfangPerMonatInEuro=" + umfangPerMonatInEuro + " Euro" +
                ", umfangPerJahrInEuro=" + umfangPerJahrInEuro + " Euro" +
                '}';
    }
}