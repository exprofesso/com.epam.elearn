package com.epam.elearn.aggregationAndСomposition.fourth;

import java.util.ArrayList;

public class Client {
    private String firstName;
    private String second;
    private String passID;
    private ArrayList<Account> accounts;

    public Client(String firstName, String second, String passID) {
        this.firstName = firstName;
        this.second = second;
        this.passID = passID;
        accounts = new ArrayList<>();
    }

    public String getBalance() {
        double balance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            balance += accounts.get(i).getBalance();
        }
        return String.format("Баланс всех считов в банке " + balance);
    }

    public String getPossitivBalance() {
        double balance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalance() > 0) {
                balance += accounts.get(i).getBalance();
            }
        }
        return String.format("Баланс положительных считов в банке " + balance);
    }
}
