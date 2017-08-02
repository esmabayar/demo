package com.example.demo.entity;


/**
 *
 * @author ugur.adalar
 */
public class Kisi {

    public Long id;
    public String adi;
    public String soyadi;
    public int yas;
    public String cinsiyet;
    public String sacRengi;

    public Kisi() {
    }

    public Kisi(String adi, String soyadi, int yas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.yas = yas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getSacRengi() {
        return sacRengi;
    }

    public void setSacRengi(String sacRengi) {
        this.sacRengi = sacRengi;
    }

    @Override
    public String toString() {
        return "Kisi{" + "adi=" + adi + ", soyadasdfi=" + soyadi + '}';
    }

}
