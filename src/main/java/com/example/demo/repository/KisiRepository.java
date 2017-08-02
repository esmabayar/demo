package com.example.demo.repository;

import com.example.demo.entity.Kisi;
import java.io.Serializable;
//import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ugur.adalar
 */
public interface KisiRepository {//extends JpaRepository<Kisi, Serializable> {
    //select * from kisi where adi = x;
    public Kisi findByAdi(String x);
    
    //select * from kisi where adi = x and soyadi = y;
    public Kisi findByAdiAndSoyadi(String x, String y);
}
