package com.example.U4_W4_D5_GestionePrenotazioni.service;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneDAORepository prenotazioneDAO;


    @Autowired @Qualifier("prenotazione1") ObjectProvider<Prenotazione> prenotazione1Provider;
    @Autowired @Qualifier("prenotazione2") ObjectProvider<Prenotazione> prenotazione2Provider;
    @Autowired @Qualifier("prenotazione3") ObjectProvider<Prenotazione> prenotazione3Provider;

    public Prenotazione createPrenotazione1(){
        return prenotazione1Provider.getObject();
    }

    public Prenotazione createPrenotazione2(){
        return prenotazione2Provider.getObject();
    }

    public Prenotazione createPrenotazione3(){
        return prenotazione3Provider.getObject();
    }


    public void salvaPrenotazione(Prenotazione p){
        prenotazioneDAO.save(p);
    }

    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneDAO.findAll();
    }

    public Optional<Prenotazione> getPrenotazioneById(long id) {
        return prenotazioneDAO.findById(id);
    }

    public void deletePrenotazione(long id) {
        prenotazioneDAO.deleteById(id);
    }
}
