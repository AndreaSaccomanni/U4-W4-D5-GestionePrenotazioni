package com.example.U4_W4_D5_GestionePrenotazioni.service;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneService {

    @Autowired
    private PostazioneDAORepository postazioneDAO;

    @Autowired
    private PrenotazioneDAORepository prenotazioneDAO;

    @Autowired
    private UtenteDAORepository utenteDAO;

    // CREAZIONE PRENOTAZIONI
    @Autowired @Qualifier("prenotazione1") ObjectProvider<Prenotazione> prenotazione1Provider;
    @Autowired @Qualifier("prenotazione2") ObjectProvider<Prenotazione> prenotazione2Provider;
    @Autowired @Qualifier("prenotazione3") ObjectProvider<Prenotazione> prenotazione3Provider;
    @Autowired @Qualifier("prenotazione4") ObjectProvider<Prenotazione> prenotazione4Provider;
    @Autowired @Qualifier("prenotazione5") ObjectProvider<Prenotazione> prenotazione5Provider;


    public Prenotazione createPrenotazione1(){
        return prenotazione1Provider.getObject();
    }

    public Prenotazione createPrenotazione2(){
        return prenotazione2Provider.getObject();
    }

    public Prenotazione createPrenotazione3(){
        return prenotazione3Provider.getObject();
    }

    public Prenotazione createPrenotazione4(){
        return prenotazione4Provider.getObject();
    }

    public Prenotazione createPrenotazione5(){
        return prenotazione5Provider.getObject();
    }



    //METODI PRENOTAZIONI

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


    // Metodo per verificare sia la disponibilità della postazione che le prenotazioni dell'utente
    public boolean isPrenotazioneValida(Prenotazione p) {
        if (!isPostazioneLibera(p.getPostazione(), p.getDataPrenotazione())) {
            System.out.println("La postazione non è disponibile per questa data.");
            return false;
        }
        if (!isUtentePrenotatoPerData(p.getUtente(), p.getDataPrenotazione())) {
            System.out.println("L'utente ha già una prenotazione per questa data.");
            return false;
        }
        // Se entrambe le condizioni sono soddisfatte, la prenotazione è valida
        return true;
    }

    // metodo per vedere se una postazione è libera
    private boolean isPostazioneLibera(Postazione postazione, LocalDate dataPrenotazione) {
        Long count = prenotazioneDAO.controlloPrenotazionePerPostazioneEData(postazione.getCodiceUnivoco(), dataPrenotazione);
        return count == 0;
    }

    // metodo per vedere se l'utente ha già prenotato una postazione per la stessa data
    private boolean isUtentePrenotatoPerData(Utente utente, LocalDate dataPrenotazione) {
        Long count = prenotazioneDAO.controlloPrenotazionePerUtenteEData(utente.getId(), dataPrenotazione);
        return count == 0;
    }

    // metodo per controllare validità data prenotazione
    public boolean controllaDataPrenotazione(LocalDate dataPrenotazione) {
        LocalDate dataCorrente = LocalDate.now();
        if (dataPrenotazione.isBefore(dataCorrente)) {
            return false;
        }
        return true;
    }

    // metodo per vedere se viene trovata la postazione da prenotare
    public boolean isPostazioneEsistente(Long codicePostazione) {
        return postazioneDAO.findByCodiceUnivoco(codicePostazione) != null;
    }

    //metodo per vedere se viene trovato l'utente che vuole fare la prenotazione
    public boolean isUtenteEsistente(String username) {
        return utenteDAO.findByUsername(username) != null;
    }


}



