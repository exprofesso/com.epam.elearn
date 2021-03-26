package com.epam.elearn.aggregationAndСomposition.fifth;

import java.util.ArrayList;
import java.util.Comparator;

public class ToureConstructor {
    private ArrayList<Client> clients;
    private ArrayList<TourePackage> tourePackages;
    private String nameToureOperator;


    public ToureConstructor(String nameToureOperator) {
        this.nameToureOperator = nameToureOperator;
        clients = new ArrayList<>();
        tourePackages = new ArrayList<>();
    }

    void addTourePackade(TourePackage tourePackage) {
        tourePackages.add(tourePackage);
    }

    void addClients(Client client, TourePackage tourePackage) {
        clients.add(client);
        tourePackages.add(tourePackage);
    }

    ArrayList<TourePackage> selectByTourePackege(TourPackageType tourePackage) {
        ArrayList<TourePackage> tourePackages = new ArrayList<>();
        for (TourePackage tour : tourePackages) {
            if (tour.getTourPackageType().equals(tourePackage)) {
                tourePackages.add(tour);
            }
        }
        return tourePackages;
    }

    ArrayList<TourePackage> selectMoreTransport(Transport transport) {
        ArrayList<TourePackage> tourePackages = new ArrayList<>();
        for (TourePackage tour : tourePackages) {
            if (tour.getTransport().equals(transport)) {
                tourePackages.add(tour);
            }
        }
        return tourePackages;
    }

    ArrayList<TourePackage> selectMoreTransport(int date) {
        ArrayList<TourePackage> tourePackages = new ArrayList<>();
        for (TourePackage tour : tourePackages) {
            if (tour.getNumberOfDay() == date) {
                tourePackages.add(tour);
            }
        }
        return tourePackages;
    }

    ArrayList<TourePackage> selectMoreTransport(Transport transport, Food food, int days) {
        ArrayList<TourePackage> tourePackages = new ArrayList<>();
        for (TourePackage tour : tourePackages) {
            if (tour.getTransport().equals(transport) && tour.getFood().equals(food) && tour.getNumberOfDay() == days) {
                tourePackages.add(tour);
            }
        }
        return tourePackages;
    }

    static void printListTourePackage(ArrayList<TourePackage> tourePackages) {
        if (tourePackages.size() > 1) {
            for (TourePackage tour : tourePackages) {
                System.out.println(tour.getCountry() + " " + tour.getTour() + " " + tour.getTransport() + " "
                        + tour.getFood() + " " + tour.getNumberOfDay() + " " + tour.getPrice());
            }
        } else {
            System.out.println("Простите, но туров не найдено");
        }
    }

    void SortNumberOfDay() {
        tourePackages.sort(Comparator.comparing(TourePackage::getNumberOfDay));
    }

    static void SortNumberOfDay(ArrayList<TourePackage> tour) {
        tour.sort(Comparator.comparing(TourePackage::getNumberOfDay));
    }

    void SortByPrice() {
        tourePackages.sort(Comparator.comparing(TourePackage::getPrice));
    }

    static void sortByPrice(ArrayList<TourePackage> tour) {
        tour.sort(Comparator.comparing(TourePackage::getPrice));
    }

    public String getNameToureOperator() {
        return nameToureOperator;
    }

    public void setNameToureOperator(String nameToureOperator) {
        this.nameToureOperator = nameToureOperator;
    }

    public ArrayList<TourePackage> getTourePackages() {
        return tourePackages;
    }

    public void setTourePackages(ArrayList<TourePackage> tourePackages) {
        this.tourePackages = tourePackages;
    }
}
