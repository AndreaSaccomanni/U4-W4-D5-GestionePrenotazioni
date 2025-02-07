package com.example.U4_W4_D5_GestionePrenotazioni.configuration;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Edificio;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.enumeration.Tipo;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.EdificioDAORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class postazioneConfiguration {
    @Autowired
    private EdificioDAORepository edificioDAO;

    @Bean(name = "postazione1")
    public Postazione postazione1() {
        return new Postazione("Postazione 1", Tipo.PRIVATO, 4, edificioDAO.findByNome("Edificio A"));
    }

    @Bean(name = "postazione2")
    public Postazione postazione2() {
        return new Postazione("Postazione 2", Tipo.OPENSPACE, 10, edificioDAO.findByNome("Edificio B"));
    }

    @Bean(name = "postazione3")
    public Postazione postazione3() {
        return new Postazione("Postazione 3", Tipo.SALA_RIUNIONI, 6, edificioDAO.findByNome("Edificio C"));
    }

    @Bean(name = "postazione4")
    public Postazione postazione4() {
        return new Postazione("Postazione 4", Tipo.OPENSPACE, 8, edificioDAO.findByNome("Edificio A"));
    }

    @Bean(name = "postazione5")
    public Postazione postazione5() {
        return new Postazione("Postazione 5", Tipo.SALA_RIUNIONI, 12, edificioDAO.findByNome("Edificio A"));
    }

    @Bean(name = "postazione6")
    public Postazione postazione6() {
        return new Postazione("Postazione 6", Tipo.PRIVATO, 2, edificioDAO.findByNome("Edificio B"));
    }

    @Bean(name = "postazione7")
    public Postazione postazione7() {
        return new Postazione("Postazione 7", Tipo.SALA_RIUNIONI, 15, edificioDAO.findByNome("Edificio B"));
    }

    @Bean(name = "postazione8")
    public Postazione postazione8() {
        return new Postazione("Postazione 8", Tipo.OPENSPACE, 20, edificioDAO.findByNome("Edificio C"));
    }

    @Bean(name = "postazione9")
    public Postazione postazione9() {
        return new Postazione("Postazione 9", Tipo.PRIVATO, 5, edificioDAO.findByNome("Edificio C"));
    }
}
