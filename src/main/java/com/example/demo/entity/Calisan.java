/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

/**
 *
 * @author ugur.adalar
 */
public class Calisan {

    public int maas;
    public String unvan;
    public String sicilNo;
    public String birim;
    public Kisi kisi;

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    @Override
    public String toString() {
        return "Calisan{" + "maas=" + maas + ", unvan=" + unvan + ", sicilNo=" + sicilNo + ", birim=" + birim + ", kisi=" + kisi + '}';
    }

}
