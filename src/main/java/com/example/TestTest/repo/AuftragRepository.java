package com.example.TestTest.repo;

import com.example.TestTest.model.Auftrag;
import com.example.TestTest.model.Kunden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AuftragRepository extends JpaRepository<Auftrag, Integer> {
    List<Auftrag> findByKundenNr(int kundeNummer);

    List<Auftrag> findAll();

    List<Auftrag> findAllByAuftragRealisiertAmIsGreaterThanEqual(LocalDate date);
}
