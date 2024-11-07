package com.devoir;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Bank {
    private String id, pays;
    private Set<Compte> comptes;

    public Bank() {}

    public Bank(String id, String pays) {
        this.id = id;
        this.pays = pays;
    }

    @JsonManagedReference
    public Set<Compte> getComptes() {
        return comptes;
    }
}
