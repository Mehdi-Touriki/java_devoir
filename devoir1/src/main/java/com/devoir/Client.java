package com.devoir;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.Date;
import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
public class Client {
    private String numClient, nom, prenom, phone, email;
    private Set<Compte> comptes;
    public void ajoutClient(Compte compte){
        compte.setClient(this);
        this.comptes.add(compte);
    }
    public void creationCompte(Bank bank){
        Date dateCreation = new Date();
        String numCompte = UUID.randomUUID().toString();
        Compte nouveauCompte = new Compte(numCompte, "DHS", dateCreation, dateCreation);
        nouveauCompte.setBank(bank);
        nouveauCompte.setClient(this);
        this.comptes.add(nouveauCompte);
        bank.setComptes(comptes);
    }
}
