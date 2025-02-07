package com.example.U4_W4_D5_GestionePrenotazioni.runner;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PostazioneRunner implements CommandLineRunner {

    @Autowired
    private PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {
        Postazione pos1 = postazioneService.createPostazione1();
        Postazione pos2 = postazioneService.createPostazione2();
        Postazione pos3 = postazioneService.createPostazione3();

//        postazioneService.salvaPostazione(pos1);
//        postazioneService.salvaPostazione(pos2);
//        postazioneService.salvaPostazione(pos3);

    }
}
