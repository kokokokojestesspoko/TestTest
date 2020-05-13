package com.example.TestTest;

import com.example.TestTest.model.Auftrag;
import com.example.TestTest.model.Kunden;
import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KundenRepository extends JpaRepository<Kunden,Integer> {
    List<Kunden> findByKundeNr(int kundeNummer);

    @Query(value = "FROM Kunden k where k.email <> ''")
    List<Kunden> findAllByNotEmptyEmail();
    @Query(value = "From Kunden k where (k.email IS NOT NULL and k.festnetz <> '' ) or (k.email <>'' and k.mobil <>'') ")
    List<Kunden> findWithEmailAndPhone();

}
