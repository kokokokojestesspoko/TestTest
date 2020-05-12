package com.example.TestTest;

import com.example.TestTest.model.Auftrag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuftragRepository extends JpaRepository<Auftrag,Integer> {
    List<Auftrag> findByKundenNr(int kundeNummer);


}
