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
@Table(name = "utenti")
public class Utente {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String username;
    private String nomeECognome;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioni;

    public Utente(String username, String nomeECognome, String email) {
        this.username = username;
        this.nomeECognome = nomeECognome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "username='" + username + '\'' +
                ", nomeECognome='" + nomeECognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
