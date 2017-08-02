/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.resource;

import com.example.demo.entity.Kisi;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ugur.adalar
 */
@RestController
@RequestMapping("/kisi")
public class KisiResource {

    List<Kisi> kisiListesi = new ArrayList<>();

    @RequestMapping("/hello/{adi}")
    public String sayHello(@PathVariable String adi) {
        return "hello " + adi;
    }

    @RequestMapping("/newKisi")
    public Kisi newKisi(@RequestParam String adi, @RequestParam String soyadi) {
        Kisi kisi = new Kisi();
        kisi.setAdi(adi);
        kisi.setSoyadi(soyadi);
        kisiListesi.add(kisi);

        return kisi;
    }

    @RequestMapping("/getKisi")
    public Kisi getKisi(@RequestParam String adi) {
        for (Kisi kisi : kisiListesi) {
            if (kisi.adi.equals(adi)) {
                return kisi;
            }
        }
        return null;
    }
    
    @RequestMapping("/getAll")
    public List getAll(){
        return kisiListesi;
    }
}
