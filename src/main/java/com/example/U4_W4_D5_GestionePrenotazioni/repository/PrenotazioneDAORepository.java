package com.example.U4_W4_D5_GestionePrenotazioni.repository;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import com.example.U4_W4_D5_GestionePrenotazioni.enumeration.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione, Long> {

    Prenotazione findByPostazione(Postazione postazione);

    Prenotazione findByUtente(Utente utente);

//    @Query("SELECT p FROM Prenotazioni p WHERE p.postazione_id = :idPostazione" +
//            " AND p.data_prenotazione < :dataInizioPrenotazione ")
//    public List<Prenotazione> verificaPostazioneLibera(Long idPostazione, LocalDate dataInizioPrenotazione, LocalDate dataFinePrenotazione);

    //query per cercare prenotazioni disponibili
    @Query("SELECT COUNT(p) FROM Prenotazione p WHERE p.utente.id = :idUtente AND p.postazione.id = :idPostazione AND p.dataPrenotazione = :dataPrenotazione")
    public long controlloValiditaPrenotazione(@Param("idUtente") Long idUtente,
                                                            @Param("idPostazione") Long idPostazione,
                                                            @Param("dataPrenotazione") LocalDate dataPrenotazione);

    //query per cercare prentotzioni tramite tipo e città

    @Query("SELECT p FROM Prenotazione p " +
            "WHERE p.postazione.tipo = :tipoPostazione " +
            "AND p.postazione.citta = :citta")
    List<Prenotazione> findByTipoAndCitta(Tipo tipoPostazione, String citta);
}
