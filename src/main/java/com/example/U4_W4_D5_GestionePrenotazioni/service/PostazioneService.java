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
    private PostazioneDAORepository postazioneDAO;

    @Autowired @Qualifier("postazione1") ObjectProvider<Postazione> postazione1Provider;
    @Autowired @Qualifier("postazione2") ObjectProvider<Postazione> postazione2Provider;
    @Autowired @Qualifier("postazione3") ObjectProvider<Postazione> postazione3Provider;

    public Postazione createPostazione1(){
        return postazione1Provider.getObject();
    }


    public Postazione createPostazione2(){
        return postazione2Provider.getObject();
    }

    public Postazione createPostazione3(){
        return postazione3Provider.getObject();
    }

    public void salvaPostazione(Postazione p){
        postazioneDAO.save(p);
    }
}
