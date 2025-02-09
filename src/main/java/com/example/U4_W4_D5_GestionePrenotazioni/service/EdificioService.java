package com.example.U4_W4_D5_GestionePrenotazioni.service;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Edificio;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.EdificioDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EdificioService {

    @Autowired
    private EdificioDAORepository edificioDAO;

    @Autowired @Qualifier("edificio1") ObjectProvider<Edificio> edificio1Provider;
    @Autowired @Qualifier("edificio2") ObjectProvider<Edificio> edificio2Provider;
    @Autowired @Qualifier("edificio3") ObjectProvider<Edificio> edificio3Provider;

    public Edificio createEdificio1(){
        return edificio1Provider.getObject();
    }

    public Edificio createEdificio2(){
        return edificio2Provider.getObject();
    }

    public Edificio createEdificio3(){
        return edificio3Provider.getObject();
    }

    public void salvaEdificio(Edificio e){
        edificioDAO.save(e);
    }

    public Optional<Edificio> getEdificioById(long id) {
        return edificioDAO.findById(id);
    }

    public void deleteEdificio(long id) {
        edificioDAO.deleteById(id);
        System.out.println("Edificio eliminato con successo");
    }

}
