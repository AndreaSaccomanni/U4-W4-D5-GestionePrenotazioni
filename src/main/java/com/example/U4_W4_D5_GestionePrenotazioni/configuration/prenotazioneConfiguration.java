package com.example.U4_W4_D5_GestionePrenotazioni.configuration;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.UtenteDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class prenotazioneConfiguration {
    @Autowired
    private PostazioneDAORepository postazioneDAO;
    @Autowired
    private UtenteDAORepository utenteDAO;
    @Autowired
    private PrenotazioneDAORepository prenotazioneDAO;
    @Autowired
    PrenotazioneService prenotazioneService;


    @Bean(name = "prenotazione1")
    public Prenotazione prenotazione1() {
        Prenotazione prenotazione1 = new Prenotazione(postazioneDAO.findByCodiceUnivoco(52L), utenteDAO.findByUsername("MarioRossi"), LocalDate.of(2025, 3, 21));
        if (prenotazioneService.controlloValiditaPrenotazione(prenotazione1)) {
            return prenotazione1;
        } else {
            System.out.println("Impossibile creare la prenotazione");
            return null;
        }
    }

    @Bean(name = "prenotazione2")
    public Prenotazione prenotazione2() {
        Prenotazione prenotazione2 = new Prenotazione(postazioneDAO.findByCodiceUnivoco(53L), utenteDAO.findByUsername("MarioRossi"), LocalDate.of(2025, 3, 21));
        if (prenotazioneService.controlloValiditaPrenotazione(prenotazione2)) {
            return prenotazione2;
        } else {
            System.out.println("Impossibile creare la prenotazione");
            return null;
        }
//
//    @Bean(name = "prenotazione3")
//    public Prenotazione prenotazione3() {
//        return new Prenotazione(postazioneDAO.findByCodiceUnivoco(54L), utenteDAO.findByUsername("GiacomoNeri"));
//    }
//
//    @Bean(name = "prenotazione4")
//    public Prenotazione prenotazione4() {
//        return new Prenotazione(postazioneDAO.findByCodiceUnivoco(55L), utenteDAO.findByUsername("MarioRossi"));
//    }
//
//    @Bean(name = "prenotazione5")
//    public Prenotazione prenotazione5() {
//        return new Prenotazione(postazioneDAO.findByCodiceUnivoco(56L), utenteDAO.findByUsername("LuigiVerdi"));
//    }
//
//    @Bean(name = "prenotazione6")
//    public Prenotazione prenotazione6() {
//        return new Prenotazione(postazioneDAO.findByCodiceUnivoco(57L), utenteDAO.findByUsername("GiacomoNeri"));
//    }
//
//    @Bean(name = "prenotazione7")
//    public Prenotazione prenotazione7() {
//        return new Prenotazione(postazioneDAO.findByCodiceUnivoco(58L), utenteDAO.findByUsername("MarioRossi"));
//    }
//
//    @Bean(name = "prenotazione8")
//    public Prenotazione prenotazione8() {
//        return new Prenotazione(postazioneDAO.findByCodiceUnivoco(59L), utenteDAO.findByUsername("LuigiVerdi"));
//    }
//
//    @Bean(name = "prenotazione9")
//    public Prenotazione prenotazione9() {
//        return new Prenotazione(postazioneDAO.findByCodiceUnivoco(60L), utenteDAO.findByUsername("GiacomoNeri"));
//    }


    }
}
