package com.example.U4_W4_D5_GestionePrenotazioni.runner;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.enumeration.Tipo;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostazioneRunner implements CommandLineRunner {

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private PostazioneDAORepository postazioneDAO;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----- POSTAZIONE RUNNER -----");
//        Postazione pos1 = postazioneService.createPostazione1();
//        Postazione pos2 = postazioneService.createPostazione2();
//        Postazione pos3 = postazioneService.createPostazione3();
//        Postazione pos4 = postazioneService.createPostazione4();
//        Postazione pos5 = postazioneService.createPostazione5();
//        Postazione pos6 = postazioneService.createPostazione6();
//        Postazione pos7 = postazioneService.createPostazione7();
//        Postazione pos8 = postazioneService.createPostazione8();
//        Postazione pos9 = postazioneService.createPostazione9();
//
//        postazioneService.salvaPostazione(pos1);
//        postazioneService.salvaPostazione(pos2);
//        postazioneService.salvaPostazione(pos3);
//        postazioneService.salvaPostazione(pos4);
//        postazioneService.salvaPostazione(pos5);
//        postazioneService.salvaPostazione(pos6);
//        postazioneService.salvaPostazione(pos7);
//        postazioneService.salvaPostazione(pos8);
//        postazioneService.salvaPostazione(pos9);

        List<Postazione> postazioni = postazioneDAO.findAll();
        System.out.println("Le postazioni disponibili sono:");
        postazioni.forEach(p -> System.out.println(p));

        //RICERCA POSTAZIONE PER TIPO E CITTA'
        postazioneService.cercaPrenotazioniPerTipoPostazioneECitta(Tipo.OPENSPACE, "napoli");


    }
}
