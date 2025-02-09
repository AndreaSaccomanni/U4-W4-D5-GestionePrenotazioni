package com.example.U4_W4_D5_GestionePrenotazioni.repository;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAORepository extends JpaRepository<Utente, Long> {

    Utente findByUsername(String usernme);

    Utente findByNomeECognome(String nomeECognome);

    Utente findByEmail(String email);


}
