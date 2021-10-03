package com.epam.elearn.aggregationAndСomposition.fifth;

import java.util.ArrayList;
import java.util.Comparator;

public class TourConstructor {
    private ArrayList<Client> clients;
    private ArrayList<TourPackage> tourPackages;
    private String nameTourOperator;


    public TourConstructor(String nameTourOperator) {
        this.nameTourOperator = nameTourOperator;
        clients = new ArrayList<>();
        tourPackages = new ArrayList<>();
    }

    void addTourPackage(TourPackage tourPackage) {
        tourPackages.add(tourPackage);
    }

    void addClients(Client client, TourPackage tourPackage) {
        clients.add(client);
        client.setTourPackage(tourPackage);
    }

    // выборка по типу путевки
    ArrayList<TourPackage> selectByTourPackege(TourPackageType type) {
        ArrayList<TourPackage> typeArray = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getTourPackageType().equals(type)) {
                typeArray.add(tour);
            }
        }
        return typeArray;
    }

    // выборка по типу транспорта
    ArrayList<TourPackage> selectMoreTransport(Transport transport) {
        ArrayList<TourPackage> transportArray = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getTransport().equals(transport)) {
                transportArray.add(tour);
            }
        }
        return transportArray;
    }

    // выборка по колличеству дней
    ArrayList<TourPackage> selectMoreTransport(int date) {
        ArrayList<TourPackage> dateArray = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getNumberOfDay() == date) {
                dateArray.add(tour);
            }
        }
        return dateArray;
    }

    // выборка по типу транспорта, типу еды и колличеству дней
    ArrayList<TourPackage> selectMoreTransport(Transport transport, Food food, int days) {
        ArrayList<TourPackage> tourConditionsArray = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getTransport().equals(transport) && tour.getFood().equals(food) && tour.getNumberOfDay() == days) {
                tourConditionsArray.add(tour);
            }
        }
        return tourConditionsArray;
    }

    static void printListTourPackage(ArrayList<TourPackage> tourPackages) {
        if (tourPackages.size() == 0) {
            System.out.println("Простите, но туров не найдено");
            return;
        }
        for (TourPackage tour : tourPackages) {
            System.out.println(tour.getCountry() + ", " + tour.getTour() + ", " + tour.getTransport() + ", "
                    + tour.getFood() + ", " + tour.getNumberOfDay() + " day, " + tour.getPrice() + "$");
        }

    }

    // сортировка по колличеству дней
    void SortNumberOfDay() {
        tourPackages.sort(Comparator.comparing(TourPackage::getNumberOfDay));
    }

    static void SortNumberOfDay(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getNumberOfDay));
    }

    // сортировка по цене
    void SortByPrice() {
        tourPackages.sort(Comparator.comparing(TourPackage::getPrice));
    }

    static void sortByPrice(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getPrice));
    }

    public String getNameTourOperator() {
        return nameTourOperator;
    }

    public void setNameTourOperator(String nameTourOperator) {
        this.nameTourOperator = nameTourOperator;
    }

    public ArrayList<TourPackage> getTourPackages() {
        return tourPackages;
    }

    public void setTourPackages(ArrayList<TourPackage> tourPackages) {
        this.tourPackages = tourPackages;
    }
}
