package com.example.U4_W4_D5_GestionePrenotazioni.repository;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.enumeration.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione, Long> {



    Postazione findByCodiceUnivoco(Long codiceUnivoco);

    Postazione findByTipo(Tipo tipo);

    Postazione findByDescrizione(String descrizione);

    Postazione findByNumeroMaxOccupanti(int numeroMaxOccuoanti);

    //query per cercare prentotzioni tramite tipo e città
    @Query("SELECT p FROM Postazione p " +
            "WHERE p.tipo = :tipo " +
            "AND p.edificio.citta = :citta")
    List<Postazione> findByTipoAndCitta(Tipo tipo, String citta);
}
