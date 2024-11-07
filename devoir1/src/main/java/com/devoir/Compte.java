package com.devoir;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
@Getter
@Setter
@AllArgsConstructor
public class Compte {
    private String numCompte, devise;
    private Date dateCreation, dateUpdate;
    private Bank bank;
    private Client client;
    private Set<Transaction> transactions;
}
