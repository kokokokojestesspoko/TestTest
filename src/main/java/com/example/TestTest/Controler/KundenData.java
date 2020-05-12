package com.example.TestTest.Controler;

import com.example.TestTest.model.Auftrag;
import com.example.TestTest.model.Kunden;

import java.util.ArrayList;
import java.util.List;

public class KundenData {


        private List<Kunden> kunden;

        private static com.example.TestTest.Controler.KundenData instance = null;

        public static com.example.TestTest.Controler.KundenData getInstance() {
            if (instance == null) {
                instance = new com.example.TestTest.Controler.KundenData();

            }
            return instance;
        }

        public KundenData() {
           kunden = new ArrayList<Kunden>();

        }

        public List<Kunden> fetchKunden() {
            return kunden;
        }

        public Kunden getKundenByKundenNr(int kundeNummer) {
            for (Kunden k : kunden) {
                if (k.getKundeNr() == kundeNummer) {
                    return k;
                }

            }
            return null;
        }
    }

