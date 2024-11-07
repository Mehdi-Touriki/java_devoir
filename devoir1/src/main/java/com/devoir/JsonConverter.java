package com.devoir;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;

public class JsonConverter {

    // Method to convert JSON string to Client object
    public static Client fromJsonToClient(String jsonString) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonString, Client.class);
    }

    // Method to convert JSON string to Compte object
    public static Compte fromJsonToCompte(String jsonString) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonString, Compte.class);
    }

    // Method to convert JSON string to Bank object
    public static Bank fromJsonToBank(String jsonString) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonString, Bank.class);
    }

    // Method to convert JSON string to Transaction object
    public static Transaction fromJsonToTransaction(String jsonString) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonString, Transaction.class);
    }

    // Utility method to pretty-print JSON
    public static String toJsonPretty(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            String jsonClient = "{\"numClient\":\"123\",\"nom\":\"John\",\"prenom\":\"Doe\",\"phone\":\"0123456789\",\"email\":\"john.doe@example.com\",\"comptes\":[{\"numCompte\":\"23342\",\"devise\":\"Dhs\",\"dateCreation\":1730998418121,\"dateUpdate\":1730998418121,\"transactions\":null}]}";
            
            // Deserialize JSON into Client object
            Client clientFromJson = JsonConverter.fromJsonToClient(jsonClient);
            System.out.println("Deserialized Client: " + clientFromJson.getNom() + " " + clientFromJson.getPrenom());

            // Pretty-print the original JSON string (just for example)
            String prettyJson = JsonConverter.toJsonPretty(clientFromJson);
            System.out.println("Pretty-printed JSON: " + prettyJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
