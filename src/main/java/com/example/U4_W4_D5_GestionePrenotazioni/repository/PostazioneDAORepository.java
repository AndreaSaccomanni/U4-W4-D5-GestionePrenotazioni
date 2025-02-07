package com.example.U4_W4_D5_GestionePrenotazioni.repository;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.enumeration.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione, Long> {



    Postazione findByCodiceUnivoco(Long codiceUnivoco);

    Postazione findByTipo(Tipo tipo);

    Postazione findByDescrizione(String descrizione);

    Postazione findByNumeroMaxOccupanti(int numeroMaxOccuoanti);
}
