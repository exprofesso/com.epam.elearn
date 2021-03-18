package com.epam.elearn.aggregationAndСomposition.third;

import java.util.ArrayList;

public class Country {
    private String nameCountry;
    private Town capital;
    private ArrayList<Region> regions;


    public Country(String nameCountry, Town capital) {
        this.nameCountry = nameCountry;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    // вывод в консоль столицы страны
    public void capitalToString() {
        System.out.println("Столица страны " + capital.toString());
    }

    //  вывод в консоль колличество регионов
    public void countRegion() {
        System.out.println("Колличество областей в данной стране  " + regions.size());
    }

    //  вывод в консоль территории страны
    public void areaCountry() {
        int area = 0;
        for (int i = 0; i < regions.size(); i++) {
            area += regions.get(i).getArea();
        }
        System.out.println("Площадь страны равна " + area);
    }

    // вывод на консоль колличество областей
    public void regionCentre() {
        for (int i = 0; i < regions.size(); i++) {
            System.out.println(regions.get(i).getNameRegion());
        }
    }

    void addRegion(Region region) {
        regions.add(region);
    }

    void removeRegion(String regionName) {
        for (Region region : regions) {
            if (regionName.equals(region.getNameRegion())) {
                regions.remove(region);
            }
        }
    }
}
