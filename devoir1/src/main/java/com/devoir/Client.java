package com.devoir;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
public class Client {
    private String numClient, nom, prenom, phone, email;
    private Set<Compte> comptes;
    public void ajoutClient(Compte compte){
        compte.setClient(this);
        this.getComptes().add(compte);
    }
}
