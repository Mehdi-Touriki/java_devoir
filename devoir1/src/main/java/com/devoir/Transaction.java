package com.devoir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Getter
public class Transaction {
    private final TransactionType type;
    private final Date timestamp;
    private final String reference;
    private final Set<Compte> comptes;

    @JsonCreator
    public Transaction(
            @JsonProperty("compteDebit") Compte compteDebit,
            @JsonProperty("compteCredit") Compte compteCredit) {
        this.reference = UUID.randomUUID().toString();
        this.timestamp = new Date();
        this.comptes = Set.of(compteDebit, compteCredit);

        // Détermination du type de transaction
        if (compteDebit.getBank() == compteCredit.getBank()) {
            this.type = TransactionType.VIREST;
        } else if (compteDebit.getBank().getId().equals(compteCredit.getBank().getId())) {
            this.type = TransactionType.VIRIN;
        } else if (compteDebit.getBank().getPays().equals(compteCredit.getBank().getPays())) {
            this.type = TransactionType.VIRMULTA;
        } else {
            this.type = TransactionType.VIRCHA;
        }
    }

    @JsonBackReference
    public Set<Compte> getComptes() {
        return comptes;
    }
}
