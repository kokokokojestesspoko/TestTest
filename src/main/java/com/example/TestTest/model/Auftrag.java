package com.example.TestTest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

import static java.lang.String.format;

@Entity
@Table(name="auftrag")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Auftrag {
    public Auftrag() {
    }

    @Id

    @Column(name = "AUFTRAGSNR")
    private int auftragsNr;
    @Column(name = "KUNDENNR")
    private int kundenNr;
    @Column(name = "GEPLANTERUMFANGINEURO")
    private double geplanterUmfangInEuro;
    @Column(name = "REALISIERTERUMFANGINEURO")
    private double realisierterUmfangInEuro;
    @Column(name = "KURZBESCHREIBUNG")
    private String kurzbeschreibung;
    @Column(name = "AUFTRAGREALISIERTAM")
    private Date auftragRealisiertAm;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kundenNr", nullable = false)
    @JsonIgnore
    private Kunden kunden;

    public Auftrag(int auftragsNr, int kundenNr, double geplanterUmfangInEuro, double realisierterUmfangInEuro, String kurzbeschreibung, Date auftragRealisiertAm) {
        this.auftragsNr = auftragsNr;
        this.kundenNr = kundenNr;
        this.geplanterUmfangInEuro = geplanterUmfangInEuro;
        this.realisierterUmfangInEuro = realisierterUmfangInEuro;
        this.kurzbeschreibung = kurzbeschreibung;
        this.auftragRealisiertAm = auftragRealisiertAm;
    }

    public int getAuftragsNr() {
        return auftragsNr;
    }

    public void setAuftragsNr(int auftragsNr) {
        this.auftragsNr = auftragsNr;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public double getGeplanterUmfangInEuro() {
        return geplanterUmfangInEuro;
    }

    public void setGeplanterUmfangInEuro(double geplanterUmfangInEuro) {
        this.geplanterUmfangInEuro = geplanterUmfangInEuro;
    }

    public double getRealisierterUmfangInEuro() {
        return realisierterUmfangInEuro;
    }

    public void setRealisierterUmfangInEuro(double realisierterUmfangInEuro) {
        this.realisierterUmfangInEuro = realisierterUmfangInEuro;
    }

    public String getKurzbeschreibung() {
        return kurzbeschreibung;
    }

    public void setKurzbeschreibung(String kurzbeschreibung) {
        this.kurzbeschreibung = kurzbeschreibung;
    }

    public Date getAuftragRealisiertAm() {
        return auftragRealisiertAm;
    }

    public void setAuftragRealisiertAm(Date auftragRealisiertAm) {
        this.auftragRealisiertAm = auftragRealisiertAm;
    }

    @Override
    public String toString() {
        return "Auftrag{" +
                "auftragsNr=" + auftragsNr +
                ", kundenNr=" + kundenNr +
                ", geplanterUmfangInEuro=" + geplanterUmfangInEuro +
                ", realisierterUmfangInEuro=" + realisierterUmfangInEuro +
                ", kurzbeschreibung='" + kurzbeschreibung + '\'' +
                ", auftragRealisiertAm=" + auftragRealisiertAm +
                '}';
    }
}
