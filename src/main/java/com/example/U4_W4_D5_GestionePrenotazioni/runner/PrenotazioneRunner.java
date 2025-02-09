package com.example.U4_W4_D5_GestionePrenotazioni.runner;


import com.example.U4_W4_D5_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class PrenotazioneRunner implements CommandLineRunner {

    @Autowired
    PrenotazioneService prenotazioneService;
    @Autowired
    PrenotazioneDAORepository prenotazioneDAO;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----- PRENOTAZIONE RUNNER -----");

//        Prenotazione prenotazione1 = prenotazioneService.createPrenotazione1();
//        Prenotazione prenotazione2 = prenotazioneService.createPrenotazione2();
//        Prenotazione prenotazione3 = prenotazioneService.createPrenotazione3();
//        Prenotazione prenotazione4 = prenotazioneService.createPrenotazione4();
//        Prenotazione prenotazione5 = prenotazioneService.createPrenotazione5();


//
//        prenotazioneService.salvaPrenotazione(prenotazione1);
//        prenotazioneService.salvaPrenotazione(prenotazione2);
//        prenotazioneService.salvaPrenotazione(prenotazione3);
//        prenotazioneService.salvaPrenotazione(prenotazione4);
//        prenotazioneService.salvaPrenotazione(prenotazione5);

//


//        PER VEDERE IN CONSOLE TUTTE LE PRENOTAZIONI
        System.out.println("Le prenotazioni salvate sono:");
        prenotazioneDAO.findAll().forEach(p -> System.out.println(p));


    }


}
