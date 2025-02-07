package com.example.U4_W4_D5_GestionePrenotazioni.repository;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDAORepository extends JpaRepository<Edificio, Long> {

    Edificio findByNome(String nome);
}
