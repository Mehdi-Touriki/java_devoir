package com.devoir;

import java.util.HashSet;
import java.util.Set;
import java.util.Date;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

    Client client = new Client("123", "John", "Doe", "0123456789", "john.doe@example.com");
    Set<Compte> comptes = new HashSet<Compte>();
    Compte compte1 = new Compte("23342", "Dhs", new Date(), new Date());
    comptes.add(compte1);
    client.setComptes(comptes);
    ObjectMapper objectMapper = new ObjectMapper();
    String jsonClient = objectMapper.writeValueAsString(client);
    System.out.println(jsonClient);
    
    }
}
