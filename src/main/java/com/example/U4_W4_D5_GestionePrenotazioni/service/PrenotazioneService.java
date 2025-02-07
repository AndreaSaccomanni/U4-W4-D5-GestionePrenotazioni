package com.example.U4_W4_D5_GestionePrenotazioni.service;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrenotazioneService {


    private PrenotazioneDAORepository prenotazioneRepository;

    public Prenotazione salvaPrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }
    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    public Optional<Prenotazione> getPrenotazioneById(long id) {
        return prenotazioneRepository.findById(id);
    }

    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public void deletePrenotazione(long id) {
        prenotazioneRepository.deleteById(id);
    }
}
