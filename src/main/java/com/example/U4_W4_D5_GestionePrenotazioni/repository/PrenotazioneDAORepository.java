package com.example.U4_W4_D5_GestionePrenotazioni.repository;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione, Long> {
}
