package com.example.U4_W4_D5_GestionePrenotazioni.configuration;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Postazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Prenotazione;
import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.repository.UtenteDAORepository;
import com.example.U4_W4_D5_GestionePrenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class prenotazioneConfiguration {
    @Autowired
    private PostazioneDAORepository postazioneDAO;
    @Autowired
    private UtenteDAORepository utenteDAO;
    @Autowired
    private PrenotazioneDAORepository prenotazioneDAO;
    @Autowired
    PrenotazioneService prenotazioneService;


    //METODO PER CREARE UNA PRENOTAZIONE
    public Prenotazione creaPrenotazione(Long codicePostazione, String usernameUtente, LocalDate dataPrenotazione) {
        if (!prenotazioneService.isPostazioneEsistente(codicePostazione)) {
            System.out.println("La postazione con codice " + codicePostazione + " non esiste.");
            return null;
        }

        if (!prenotazioneService.isUtenteEsistente(usernameUtente)) {
            System.out.println("L'utente con username " + usernameUtente + " non esiste.");
            return null;
        }
        Postazione postazione = postazioneDAO.findByCodiceUnivoco(codicePostazione);
        Utente utente = utenteDAO.findByUsername(usernameUtente);

        Prenotazione prenotazione = new Prenotazione(postazione, utente, dataPrenotazione);

        if (prenotazioneService.isPrenotazioneValida(prenotazione)) {
            System.out.println("Prentazione avvenuta con successo!");
            return prenotazione;
        } else {
            System.out.println("Impossibile creare la prenotazione per " + usernameUtente + " il " + dataPrenotazione);
            return null;
        }
    }


//    @Bean(name = "prenotazione1")
//    public Prenotazione prenotazione1() {
//        LocalDate dataPrenotazione = LocalDate.of(2025, 3, 21);
//        if (prenotazioneService.controllaDataPrenotazione(dataPrenotazione)) {
//            Prenotazione prenotazione1 = creaPrenotazione(102L, "MarioRossi", LocalDate.of(2025, 3, 21));
//            if (prenotazione1 != null) {
//                System.out.println("Prenotazione avvenuta con successo");
//                return prenotazione1;
//            } else {
//                System.out.println("Impossibile creare la prenotazione");
//                return null;
//            }
//        } else {
//            System.out.println("La data inserita non è valida");
//            return null;
//        }
//
//    }


//    @Bean(name = "prenotazione2")
//    public Prenotazione prenotazione2() {
//        LocalDate dataPrenotazione = LocalDate.of(2025, 2, 24);
//        if (prenotazioneService.controllaDataPrenotazione(dataPrenotazione)) {
//            Prenotazione prenotazione2 = creaPrenotazione(103L, "MarioRossi", LocalDate.of(2025, 2, 24));
//            if (prenotazione2 != null) {
//                System.out.println("Prenotazione avvenuta con successo");
//                return prenotazione2;
//            } else {
//                System.out.println("Impossibile creare la prenotazione");
//                return null;
//            }
//        } else {
//            System.out.println("La data inserita non è valida");
//            return null;
//        }
//    }

//    @Bean(name = "prenotazione3")
//    public Prenotazione prenotazione3() {
//        LocalDate dataPrenotazione = LocalDate.of(2025, 5, 24);
//        if (prenotazioneService.controllaDataPrenotazione(dataPrenotazione)) {
//            Prenotazione prenotazione3 = creaPrenotazione(104L, "MarioRossi", LocalDate.of(2025, 5, 24));
//            if (prenotazione3 != null) {
//                System.out.println("Prenotazione avvenuta con successo");
//                return prenotazione3;
//            } else {
//                System.out.println("Impossibile creare la prenotazione");
//                return null;
//            }
//        } else {
//            System.out.println("La data inserita non è valida");
//            return null;
//        }
//    }
//
//    @Bean(name = "prenotazione4")
//    public Prenotazione prenotazione4() {
//        LocalDate dataPrenotazione = LocalDate.of(2025, 4, 1);
//        if (prenotazioneService.controllaDataPrenotazione(dataPrenotazione)) {
//            Prenotazione prenotazione4 = creaPrenotazione(105L, "LuigiVerdi", LocalDate.of(2025, 4, 1));
//
//            if (prenotazione4 != null) {
//                System.out.println("Prenotazione avvenuta con successo");
//                return prenotazione4;
//            } else {
//                System.out.println("Impossibile creare la prenotazione");
//                return null;
//            }
//        } else {
//            System.out.println("La data inserita non è valida");
//            return null;
//        }
//
//    }
//
//    @Bean(name = "prenotazione5")
//    public Prenotazione prenotazione5() {
//        LocalDate dataPrenotazione = LocalDate.of(2025, 3, 26);
//        if (prenotazioneService.controllaDataPrenotazione(dataPrenotazione)) {
//            Prenotazione prenotazione5 = creaPrenotazione(106L, "GiacomoNeri", LocalDate.of(2025, 3, 26));
//            if (prenotazione5 != null) {
//                System.out.println("Prenotazione avvenuta con successo");
//                return prenotazione5;
//            } else {
//                System.out.println("Impossibile creare la prenotazione");
//                return null;
//            }
//        } else {
//            System.out.println("La data inserita non è valida");
//            return null;
//        }
//    }




}

