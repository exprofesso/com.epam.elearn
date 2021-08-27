package com.epam.elearn.basicsOfOop.fourth.treasure;

import java.util.Comparator;

public class Treasure implements Comparator<Treasure> {
    private String name;
    private TreasureType treasureType;
    private TreasureMaterial treasureMaterial;
    private int price;

    public Treasure() {
    }

    public Treasure(String name) {
        this.name = name;
    }

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Treasure(String name, TreasureType treasureType, int price) {
        this.name = name;
        this.treasureType = treasureType;
        this.price = price;
    }

    public Treasure(String name, TreasureType treasureType, TreasureMaterial treasureMaterial, int price) {
        this.name = name;
        this.treasureType = treasureType;
        this.treasureMaterial = treasureMaterial;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(TreasureType treasureType) {
        this.treasureType = treasureType;
    }

    public TreasureMaterial getTreasureMaterial() {
        return treasureMaterial;
    }

    public void setTreasureMaterial(TreasureMaterial treasureMaterial) {
        this.treasureMaterial = treasureMaterial;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name= '" + name + '\'' +
                ", treasureType= " + treasureType +
                ", treasureMaterial= " + treasureMaterial +
                ", price= " + price +
                '}';
    }


    @Override
    public int compare(Treasure o1, Treasure o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
