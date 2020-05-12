package com.example.TestTest.Controler;

import com.example.TestTest.model.Auftrag;

import java.util.ArrayList;
import java.util.List;

public class AuftragData {


    private List<Auftrag> auftrags;

    private static AuftragData instance = null;

    public static AuftragData getInstance() {
        if (instance == null) {
            instance = new AuftragData();

        }
        return instance;
    }

    public AuftragData() {
        auftrags = new ArrayList<Auftrag>();

    }

    public List<Auftrag> fetchAuftrags() {
        return auftrags;
    }

    public Auftrag getAuftragByKundenNr(int kundeNummer) {
        for (Auftrag a : auftrags) {
            if (a.getKundenNr() == kundeNummer) {
                return a;
            }

        }
        return null;
    }
}