package com.epam.elearn.aggregationAndСomposition.third;

public class Region {
    private String nameRegion;
    private int area;
    private Town town;

    public Region(String nameRegion, int area, Town town) {
        this.nameRegion = nameRegion;
        this.area = area;
        this.town = town;
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

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
}
