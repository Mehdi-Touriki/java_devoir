package com.devoir;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Client {
    private String numClient, nom, prenom, phone, email;
    private Set<Compte> comptes;

    public Client(String numClient, String nom, String prenom, String phone, String email){
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.email = email;
    }

    @JsonManagedReference  // Cette annotation indique que 'comptes' est le côté "géré"
    public Set<Compte> getComptes() {
        return comptes;
    }
}
