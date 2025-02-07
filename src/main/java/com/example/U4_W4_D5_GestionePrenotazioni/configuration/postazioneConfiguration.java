package com.example.U4_W4_D5_GestionePrenotazioni.configuration;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Edificio;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.enumeration.Tipo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class postazioneConfiguration {

    @Bean
    public Postazione postazione1(Edificio edificio1) {
        return new Postazione("Postazione 1", Tipo.PRIVATO, 4, edificio1);
    }

    @Bean
    public Postazione postazione2(Edificio edificio2) {
        return new Postazione("Postazione 2", Tipo.OPENSPACE, 10, edificio2);
    }

    @Bean
    public Postazione postazione3(Edificio edificio3) {
        return new Postazione("Postazione 3", Tipo.SALA_RIUNIONI, 6, edificio3);
    }
}
