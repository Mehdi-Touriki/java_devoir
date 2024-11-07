package com.devoir;
import java.util.Date;
import lombok.Getter;
import java.util.Set;
import java.util.UUID;

@Getter
public class Transaction {
    private final TransactionType type;
    private final Date timestamp;
    private final String reference;
    private final Set<Compte> comptes;
    public Transaction(Set<Compte> comptes){
        this.reference = UUID.randomUUID().toString();
        this.timestamp = new Date();
        this.comptes = comptes;
        
    }
}
