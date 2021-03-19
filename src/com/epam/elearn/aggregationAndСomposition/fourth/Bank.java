package com.epam.elearn.aggregationAndСomposition.fourth;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Client> clients;

    public Bank(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public Client getClient(String passId) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getPassID().equalsIgnoreCase(passId)) {
                return clients.get(i);
            }
        }
        return null;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Bank", name, clients.size());
    }
}
