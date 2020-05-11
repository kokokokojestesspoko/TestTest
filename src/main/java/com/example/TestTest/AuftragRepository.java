package com.example.TestTest;

import model.Auftrag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuftragRepository extends JpaRepository<Auftrag,Integer> {
    List<Auftrag> findByKundenNr(int kundeNummer);


}
