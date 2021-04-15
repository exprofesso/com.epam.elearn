package com.epam.elearn.aggregationAndСomposition.third;

import java.util.ArrayList;
import java.util.Collections;

public class Region {
    private String nameRegion;
    private int area;
    private ArrayList<Town> townArrayList;
//   private Town town;

    public Region(String nameRegion, int area, Town... town) {
        this.nameRegion = nameRegion;
        this.area = area;
//       this.town = town;
        townArrayList = new ArrayList<>();
        Collections.addAll(townArrayList, town);
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    // население региона
    public int PopulationRegion() {
        int population = 0;
        for (int i = 0; i < townArrayList.size(); i++) {
            population += townArrayList.get(i).getPopulation();
        }
        return population;
    }

//    public Town getTown() {
//        return town;
//    }
//
//    public void setTown(Town town) {
//        this.town = town;
//    }
}
