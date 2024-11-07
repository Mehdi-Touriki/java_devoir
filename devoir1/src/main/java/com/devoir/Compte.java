package com.devoir;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class Compte {
    private String numCompte, devise;
    private Date dateCreation, dateUpdate;
    private Bank bank;
    private Client client;
    private Set<Transaction> transactions;

    public Compte(String numCompte, String devise, Date dateCreation, Date dateUpdate) {
        this.numCompte = numCompte;
        this.devise = devise;
        this.dateCreation = dateCreation;
        this.dateUpdate = dateUpdate;
    }

    @JsonBackReference  // Cette annotation ignore la référence inverse (évite la boucle infinie)
    public Client getClient() {
        return client;
    }

    @JsonBackReference  // Ignore également la référence à la banque pour éviter la boucle
    public Bank getBank() {
        return bank;
    }
}
