package com.example.U4_W4_D5_GestionePrenotazioni.configuration;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Edificio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class edificioConfiguration {

    @Bean
    public Edificio edificio1() {
        return new Edificio("Edificio A", "Via Roma 1", "Roma");
    }

    @Bean
    public Edificio edificio2() {
        return new Edificio("Edificio B", "Via Milano 22", "Milano");
    }

    @Bean
    public Edificio edificio3() {
        return new Edificio("Edificio C", "Corso Venezia 5", "Napoli");
    }
}
