package com.example.U4_W4_D5_GestionePrenotazioni.service;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PostazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {

    @Autowired
    PostazioneDAORepository postazioneDAO;

    @Autowired @Qualifier("postazione")
    ObjectProvider<Postazione> postazioneProvider;
}
