package com.example.U4_W4_D5_GestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "prenotazioni")
public class Prenotazione {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @Column(nullable = false)
    private LocalDate dataPrenotazione;
    private LocalDate scadenzaPrenotazione;

    public Prenotazione(Postazione postazione, Utente utente, LocalDate dataPrenotazione) {
        this.postazione = postazione;
        this.utente = utente;
        this.dataPrenotazione = dataPrenotazione;
        this.scadenzaPrenotazione = calcolaScadenza();
    }

    public LocalDate calcolaScadenza() {
        return this.dataPrenotazione.plusDays(1);
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "scadenzaPrenotazione=" + scadenzaPrenotazione +
                ", dataPrenotazione=" + dataPrenotazione +
                ", utente=" + utente.getId() +
                ", postazione=" + postazione.getCodiceUnivoco() +
                '}';
    }
}
