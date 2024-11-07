package com.devoir;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Bank {
    private String id, pays;
    private Set<Compte> comptes;
    public Bank(String id, String pays){
        this.id = id;
        this.pays = pays;
    }
    public Compte rechercheCompte(Compte compte){
        for (Compte c : comptes) {
            if (c==compte)return compte;
        }
        return null;
    }
    public Client rechercheClient(Client client){
        for (Compte compte : comptes){
            if (compte.getClient() == client)return client;
        }
        return null;
    }
}
