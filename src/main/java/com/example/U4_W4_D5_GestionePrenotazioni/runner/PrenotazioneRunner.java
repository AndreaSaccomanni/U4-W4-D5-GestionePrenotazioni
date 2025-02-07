package com.example.U4_W4_D5_GestionePrenotazioni.runner;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrenotazioneRunner implements CommandLineRunner {

    @Autowired
    PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {
        Prenotazione prenotazione1 = prenotazioneService.createPrenotazione1();
        Prenotazione prenotazione2 = prenotazioneService.createPrenotazione2();
        Prenotazione prenotazione3 = prenotazioneService.createPrenotazione3();

//        prenotazioneService.salvaPrenotazione(prenotazione1);
//        prenotazioneService.salvaPrenotazione(prenotazione2);
//        prenotazioneService.salvaPrenotazione(prenotazione3);

    }
}
