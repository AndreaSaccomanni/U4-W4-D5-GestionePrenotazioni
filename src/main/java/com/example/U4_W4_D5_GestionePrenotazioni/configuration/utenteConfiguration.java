package com.example.U4_W4_D5_GestionePrenotazioni.configuration;

import com.example.U4_W4_D5_GestionePrenotazioni.entities.Utente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class utenteConfiguration {



    @Bean(name= "utente1")
    public Utente utente1(){
        Utente u1 = new Utente("MarioRossi", "Mario Rossi", "m.rossi@example.com");
        return u1;
    }

    @Bean(name= "utente2")
    public Utente utente2(){
        Utente u2 = new Utente("LuigiVerdi", "Luigi Verdi", "l.verdi@example.com");
        return u2;
    }

    @Bean(name= "utente3")
    public Utente utente3(){
        Utente u3 = new Utente("GiacomoNeri", "Giacomo Neri", "g.neri@example.com");
        return u3;
    }
}
