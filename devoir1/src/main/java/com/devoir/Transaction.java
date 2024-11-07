package com.devoir;
import java.lang.reflect.Array;
import java.util.HashSet;
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
    public Transaction(Compte compteDebit, Compte compteCredit){
        this.reference = UUID.randomUUID().toString();
        this.timestamp = new Date();
        this.comptes = new HashSet<Compte>();
        this.comptes.add(compteDebit);
        this.comptes.add(compteCredit);
        if (compteDebit.getBank()==compteCredit.getBank())type = TransactionType.VIREST;
        else if (compteDebit.getBank().getId()==compteCredit.getBank().getId())type = TransactionType.VIRIN;
        else if (compteDebit.getBank().getPays()==compteCredit.getBank().getPays())type = TransactionType.VIRMULTA;
        else type = TransactionType.VIRCHA;
    }
}
