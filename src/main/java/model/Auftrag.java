package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Auftrag {
    public Auftrag() {
    }

    @Id
    private int auftragsNr;
    private int kundenNr;
    private double geplanterUmfangInEuro;
    private double realisierterUmfangInEuro;
    private String kurzbeschreibung;
    private Date auftragRealisiertAm;

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
