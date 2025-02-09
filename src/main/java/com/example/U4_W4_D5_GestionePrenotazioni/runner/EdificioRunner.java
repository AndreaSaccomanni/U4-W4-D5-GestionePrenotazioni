package com.example.U4_W4_D5_GestionePrenotazioni.runner;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Edificio;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.EdificioDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EdificioRunner implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private EdificioDAORepository edificioDAO;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----- EDIFICIO RUNNER -----");

//        Edificio e1 = edificioService.createEdificio1();
//        Edificio e2 = edificioService.createEdificio2();
//        Edificio e3 = edificioService.createEdificio3();
//
//        edificioService.salvaEdificio(e1);
//        System.out.println("Edificio 1 salvato con successo: " + e1);
//        edificioService.salvaEdificio(e2);
//        System.out.println("Edificio 2 salvato con successo: " + e2);
//        edificioService.salvaEdificio(e3);
//        System.out.println("Edificio 3 salvato con successo: " + e3);
        List<Edificio> edifici = edificioDAO.findAll();
        System.out.println("Gli edifici disponibili sono: ");
        edifici.forEach(e -> System.out.println(e));


    }
}
