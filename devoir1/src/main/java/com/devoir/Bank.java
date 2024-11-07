package com.devoir;
import java.util.Set;
import lombok.Getter;
@Getter
public class Bank {
    private String id, pays;
    private Set<Compte> comptes;
}
