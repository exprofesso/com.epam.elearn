package com.epam.elearn.aggregationAndСomposition.fifth;

public class TourePackage {
    private String country;
    private String tour;
    private TourPackageType tourPackageType;
    private Transport transport;
    private Food food;
    private int numberOfDay;
    private int price;

    public TourePackage(String country, String tour, TourPackageType tourPackageType, Transport transport, Food food, int numberOfDay, int price) {
        this.country = country;
        this.tour = tour;
        this.tourPackageType = tourPackageType;
        this.transport = transport;
        this.food = food;
        this.numberOfDay = numberOfDay;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public TourPackageType getTourPackageType() {
        return tourPackageType;
    }

    public void setTourPackageType(TourPackageType tourPackageType) {
        this.tourPackageType = tourPackageType;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
