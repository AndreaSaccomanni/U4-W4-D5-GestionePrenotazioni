package com.example.U4_W4_D5_GestionePrenotazioni.service;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    private UtenteDAORepository utenteDAO;

    @Autowired @Qualifier("utente1") ObjectProvider<Utente> utente1Provider;
    @Autowired @Qualifier("utente2") ObjectProvider<Utente> utente2Provider;
    @Autowired @Qualifier("utente3") ObjectProvider<Utente> utente3Provider;

    public Utente createUtente1(){
        return utente1Provider.getObject();
    }

    public Utente createUtente2(){
        return utente2Provider.getObject();
    }

    public Utente createUtente3(){
        return utente3Provider.getObject();
    }

    public void salvaUtente(Utente u){
        utenteDAO.save(u);
    }

    public Utente trovaUtenteTramiteEmail(String email){
        return utenteDAO.findByEmail(email);
    }

    public Utente trovaUtenteTramiteNomeECognome(String nomeECognome){
        return utenteDAO.findByNomeECognome(nomeECognome);
    }

    public Utente trovaUtenteTramiteUsername(String username){
        return utenteDAO.findByUsername(username);
    }
}
