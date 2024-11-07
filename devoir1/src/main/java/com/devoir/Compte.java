package com.devoir;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
@Getter
@Setter
@AllArgsConstructor
public class Compte {
    String numCompte;
    Date dateCreation;
    Date dateUpdate;
    String devise;

}
