package com.example.U4_W4_D5_GestionePrenotazioni.entities;

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
@Table(name = "edifici")
public class Edificio {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String indirizzo;
    private String citta;

    @OneToMany(mappedBy = "edificio", fetch = FetchType.EAGER)
    private List<Postazione> postazioni;



    public Edificio(String nome, String indirizzo, String citta) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }
}
