package com.turk.appulkeler;

/**
 * Created by sibel
 */

public class Ulke {

    private String ulkeAdi;
    private int kurulusYili;
    private int ulkeBayragi;

    public Ulke() {
        this.ulkeAdi = "Tanımsız";
        this.kurulusYili = 0;
        this.ulkeBayragi = 0;
    }

    public Ulke(String ulkeAdi, int kurulusYili, int ulkeBayragi) {
        this.ulkeAdi = ulkeAdi;
        this.kurulusYili = kurulusYili;
        this.ulkeBayragi = ulkeBayragi;
    }

    public String getUlkeAdi() {
        return ulkeAdi;
    }

    public void setUlkeAdi(String ulkeAdi) {
        this.ulkeAdi = ulkeAdi;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(int kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    public int getUlkeBayragi() {
        return ulkeBayragi;
    }

    public void setUlkeBayragi(int ulkeBayragi) {
        this.ulkeBayragi = ulkeBayragi;
    }
}
