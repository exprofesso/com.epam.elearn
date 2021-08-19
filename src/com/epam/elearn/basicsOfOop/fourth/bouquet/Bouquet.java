package com.epam.elearn.basicsOfOop.fourth.bouquet;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    String name;
    List<Flower> flowers = new ArrayList<>();
    Package aPackage;

    public Bouquet() {
    }

    public Bouquet(String name) {
        this.name = name;
    }

    public Bouquet(String name, List<Flower> flowers) {
        this.name = name;
        this.flowers = flowers;
    }

    public Bouquet(String name, List<Flower> flowers, Package aPackage) {
        this.name = name;
        this.flowers = flowers;
        this.aPackage = aPackage;
    }

    public String getName() {
        return name;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    @Override
    public String toString() {


        return "Bouquet{" +
                "name='" + name + '\'' +
                ", flowers=" + flowers +
                ", aPackage=" + aPackage +
                '}';
    }

    public void countBouqet() {
        int count = 0;
        if (flowers.isEmpty()) {
            System.out.println("Вы еще ничего не добавили");
        } else {

            for (Flower flower : flowers) {
                count += flower.getPrice();
            }
        }
        if (aPackage != null) {
            count += aPackage.price;
        }

        System.out.println("Цена букета " + count);
    }
}
