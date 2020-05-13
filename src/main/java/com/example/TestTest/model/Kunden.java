package com.example.TestTest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.implementation.bind.annotation.AllArguments;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Kunden")



public class Kunden {
    public Kunden() {
    }

    @Id
    @Column(name = "KUNDENR")
    private int kundeNr;
    @Column(name = "NAME")
    private String name;

    @Column(name = "VORNAME")
    private String vorname;
    @Column(name = "STRASSE")
    private String strasse;
    @Column(name = "PLZ")
    private int plz;
    @Column(name = "ORT")
    private String ort;
    @Column(name = "LAND")
    private String land;
    @Column(name = "FESTNETZ")
    private String festnetz;
    @Column(name = "MOBIL")
    private String mobil;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "Hinweis")
    private String hinweis;
    @OneToMany(mappedBy = "kunden", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Auftrag> auftrags;

    public Kunden(int kundeNr, String name, String vorname, String strasse, int plz, String ort, String land, String festnetz, String mobil, String email, String hinweis) {
        this.kundeNr = kundeNr;
        this.name = name;
        this.vorname = vorname;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
        this.festnetz = festnetz;
        this.mobil = mobil;
        this.email = email;
        this.hinweis = hinweis;
    }

    public Kunden(int kundeNr, String vorname, String strasse, int plz, String ort, String land, String festnetz, String mobil, String email, String hinweis) {
    }

    public int getKundeNr() {
        return kundeNr;
    }

    public void setKundeNr(int kundeNr) {
        this.kundeNr = kundeNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getFestnetz() {
        return festnetz;
    }

    public void setFestnetz(String festnetz) {
        this.festnetz = festnetz;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHinweis() {
        return hinweis;
    }

    public void setHinweis(String hinweis) {
        this.hinweis = hinweis;
    }

    public Set<Auftrag> getAuftrags() {
        return auftrags;
    }

    public void addAuftrag(Auftrag auftrag) {
        auftrags.add(auftrag);
    }

    @Override
    public String toString() {        return "Kunden{" +
            "kundeNr=" + kundeNr +
            ", name='" + name + '\'' +
            ", vorname='" + vorname + '\'' +
            ", strasse='" + strasse + '\'' +
            ", plz=" + plz +
            ", ort='" + ort + '\'' +
            ", land='" + land + '\'' +
            ", festnetz=" + festnetz +
            ", mobil=" + mobil +
            ", email='" + email + '\'' +
            ", hinweis='" + hinweis + '\'' +
            '}';
    }
}
