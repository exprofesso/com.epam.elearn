package com.epam.elearn.aggregationAndСomposition.fourth;

public class Account {
    private static int StartId = 0;
    private int id;
    private double balance;
    private boolean isOpen = false;


    public Account(double balance) {
        this.id = ++StartId;
        this.balance = balance;
        this.isOpen = true;
    }


    public static int getStartId() {
        return StartId;
    }

    public static void setStartId(int startId) {
        StartId = startId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getStatus() {
        String status = "";
        if (isOpen) {
            status = "Счет рабочий";
        } else if (!isOpen) {
            status = "Счет не рабочий";
        }
        return status;
    }

    public void block() {
        isOpen = false;
    }

    public void unblock() {
        isOpen = true;
    }

}

