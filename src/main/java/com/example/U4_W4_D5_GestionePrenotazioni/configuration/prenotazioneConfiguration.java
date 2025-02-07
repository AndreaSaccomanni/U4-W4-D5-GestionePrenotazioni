package com.example.U4_W4_D5_GestionePrenotazioni.configuration;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class prenotazioneConfiguration {


   @Bean(name = "prenotazione1")
    public Prenotazione prenotazione1(Postazione postazione1, Utente utente1) {
        return new Prenotazione(postazione1, utente1);
    }

    @Bean(name = "prenotazione2")
    public Prenotazione prenotazione2(Postazione postazione2, Utente utente2) {
        return new Prenotazione(postazione2, utente2);
    }

    @Bean(name = "prenotazione3")
    public Prenotazione prenotazione3(Postazione postazione3, Utente utente3) {
        return new Prenotazione(postazione3, utente3);
    }
}
