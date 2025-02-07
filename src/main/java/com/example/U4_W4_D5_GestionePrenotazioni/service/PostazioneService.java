package com.example.U4_W4_D5_GestionePrenotazioni.service;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.EdificioDAORepository;
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
    @Autowired @Qualifier("postazione4") ObjectProvider<Postazione> postazione4Provider;
    @Autowired @Qualifier("postazione5") ObjectProvider<Postazione> postazione5Provider;
    @Autowired @Qualifier("postazione6") ObjectProvider<Postazione> postazione6Provider;
    @Autowired @Qualifier("postazione7") ObjectProvider<Postazione> postazione7Provider;
    @Autowired @Qualifier("postazione8") ObjectProvider<Postazione> postazione8Provider;
    @Autowired @Qualifier("postazione9") ObjectProvider<Postazione> postazione9Provider;

    @Autowired
    private EdificioDAORepository edificioDao;

    public Postazione createPostazione1(){
        return postazione1Provider.getObject();
    }

    public Postazione createPostazione2(){
        return postazione2Provider.getObject();
    }

    public Postazione createPostazione3(){
        return postazione3Provider.getObject();
    }

    public Postazione createPostazione4(){
        return postazione4Provider.getObject();
    }

    public Postazione createPostazione5(){
        return postazione5Provider.getObject();
    }

    public Postazione createPostazione6(){
        return postazione6Provider.getObject();
    }

    public Postazione createPostazione7(){
        return postazione7Provider.getObject();
    }

    public Postazione createPostazione8(){
        return postazione8Provider.getObject();
    }

    public Postazione createPostazione9(){
        return postazione9Provider.getObject();
    }

    public void salvaPostazione(Postazione p){
        postazioneDAO.save(p);
    }
}
