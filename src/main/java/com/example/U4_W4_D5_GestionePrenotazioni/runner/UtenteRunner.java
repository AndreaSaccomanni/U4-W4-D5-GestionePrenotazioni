package com.example.U4_W4_D5_GestionePrenotazioni.runner;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.UtenteDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UtenteRunner implements CommandLineRunner {

    @Autowired
    UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- UtenteRunner ---");
        Utente u1 = utenteService.createUtente1();
        Utente u2 = utenteService.createUtente2();
        Utente u3 = utenteService.createUtente3();

//        utenteService.salvaUtente(u1);
//        utenteService.salvaUtente(u2);
//        utenteService.salvaUtente(u3);
    }
}
