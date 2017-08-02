package com.example.demo;

import com.example.demo.entity.Calisan;
import com.example.demo.entity.Kisi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        String adi = "Yesim";
        String soyadi = "Atasoy";

        if (args.length > 0) {
            adi = args[0];
            soyadi = args[1];
        }

        System.out.println("adi: " + adi);
        System.out.println("soyadi: " + soyadi);

        Kisi kisi = new Kisi();
        kisi.setAdi("manoj");
        kisi.setSoyadi("rapaka");
        kisi.setCinsiyet("erkek");

        Calisan calisan = new Calisan();
        calisan.setBirim("arge");
        calisan.setKisi(kisi);
        calisan.setMaas(100000);
        calisan.setSicilNo("c-123456");
        calisan.setUnvan("!Genel Mudur");

        System.out.println("calisa: " + calisan.toString());
        System.out.println("kisi: " + calisan.getKisi().toString());

    }
}
