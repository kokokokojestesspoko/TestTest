package com.example.TestTest;

import com.example.TestTest.model.Auftrag;
import com.example.TestTest.model.Kunden;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KundenRepository extends JpaRepository<Kunden,Integer> {
    List<Kunden> findByKundeNr(int kundeNummer);
}