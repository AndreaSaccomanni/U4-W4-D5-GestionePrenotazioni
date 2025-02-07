package com.example.U4_W4_D5_GestionePrenotazioni.runner;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Edificio;
import com.example.U4_W4_D5_GestionePrenotazioni.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EdificioRunner implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Override
    public void run(String... args) throws Exception {
        Edificio e1 = edificioService.createEdificio1();
        Edificio e2 = edificioService.createEdificio2();
        Edificio e3 = edificioService.createEdificio3();

//        edificioService.salvaEdificio(e1);
//        edificioService.salvaEdificio(e2);
//        edificioService.salvaEdificio(e3);

    }
}
