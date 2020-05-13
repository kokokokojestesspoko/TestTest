package com.example.TestTest;

import com.example.TestTest.model.Auftrag;
import com.example.TestTest.model.Kunden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuftragRepository extends JpaRepository<Auftrag,Integer> {
        List<Auftrag> findByKundenNr(int kundeNummer);


}
