package com.epam.elearn.aggregationAndСomposition.third;

public class Region {
    private int id;
    private String nameRegion;
    private int area;
    private Town town;

    public Region(int id, String nameRegion, int area, Town town){
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
