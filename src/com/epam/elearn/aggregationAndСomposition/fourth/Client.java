package com.epam.elearn.aggregationAndСomposition.fourth;

import java.util.ArrayList;
import java.util.Comparator;

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

    public String getPositiveBalance() {
        double balance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalance() > 0) {
                balance += accounts.get(i).getBalance();
            }
        }
        return String.format("Баланс положительных считов в банке " + balance);
    }

    public String getNegativeBalance() {
        double balance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getBalance() < 0) {
                balance -= accounts.get(i).getBalance();
            }
        }
        return String.format("Баланс отрицательных считов в банке " + balance);
    }

    public void sortBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public Account getAccount(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void blockAccount(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                accounts.get(i).block();
            }
        }
    }

    public void unBlockAccount(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                accounts.get(i).unblock();
            }
        }
    }

    public String getInfoAccount() {
        String info = "";
        for (int i = 0; i < accounts.size(); i++) {
            info += String.format("Данные по аккаунтам" + accounts.get(i).getId(), accounts.get(i).getBalance(), accounts.get(i).getStatus());
        }
        return String.format(info);
    }

    public String getPassID() {
        return passID;
    }
}
