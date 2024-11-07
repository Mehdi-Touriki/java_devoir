package com.devoir;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Compte {
    private String numCompte, devise;
    private Date dateCreation, dateUpdate;
    private Bank bank;
    private Client client;
    private Set<Transaction> transactions;
    public Compte(String numCompte, String devise, Date dateCreation, Date dateUpdate){
        this.numCompte=numCompte;
        this.devise=devise;
        this.dateCreation=dateCreation;
        this.dateUpdate=dateUpdate;
    }
}
