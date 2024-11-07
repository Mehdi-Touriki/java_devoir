package com.devoir;
import java.util.Date;
import lombok.Getter;
import java.util.Set;

@Getter
public class Transaction {
    private final TransactionType type;
    private final Date timestamp;
    private final String reference;
    private final Set<Compte> comptes;
}
