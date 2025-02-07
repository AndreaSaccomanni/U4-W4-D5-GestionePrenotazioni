package com.example.U4_W4_D5_GestionePrenotazioni.entities;

import com.example.U4_W4_D5_GestionePrenotazioni.enumeration.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "postazioni")
public class Postazione {
    @Id
    @GeneratedValue
    private Long codiceUnivoco;
    private String descrizione;
    private Tipo tipo;
    private int numeroMaxOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public Postazione(String descrizione, Tipo tipo, int numeroMaxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
    }
}
