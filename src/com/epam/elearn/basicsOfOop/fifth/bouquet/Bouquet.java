package com.epam.elearn.basicsOfOop.fifth.bouquet;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private String name;
    private List<Flower> flowers = new ArrayList<>();
    private Package aPackage;

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
        int countPrice = 0;
        int countExpDate = 999;
        if (aPackage.getPrice() != 0) {
            countPrice = +aPackage.getPrice();
        }
        ArrayList<String> flowerName = new ArrayList<>();

        for (Flower flower : flowers) {
            countPrice += flower.getPrice();
            flowerName.add(flower.getName());
            if (flower.getExpirationDate() < countExpDate) {
                countExpDate = flower.getExpirationDate();
            }
        }
        return "Букет " + name + " состоящий из " + flowerName + " по цене " + countPrice + " руб." + " сроком хранения " + countExpDate + " дней";
    }

    // подсчет цены букета из цветов и укаповки
    public void countBouqet() {
        int countPrice = 0;
        if (flowers.isEmpty()) {
            System.out.println("Вы еще ничего не добавили");
        } else {

            for (Flower flower : flowers) {
                countPrice += flower.getPrice();
            }
        }
        if (aPackage != null) {
            countPrice += aPackage.getPrice();
        }
        System.out.println("Цена букета " + countPrice + " руб.");
    }

    // подсчет срока хранения
    public void countExpirationDate() {
        int countExpDate = 999;
        for (Flower flower : flowers) {
            if (flower.getExpirationDate() < countExpDate) {
                countExpDate = flower.getExpirationDate();
            }
        }
        System.out.println("Срок хранения букета " + countExpDate + " дней");
    }

    // Подсчет храанения и цены
    public void priceAndExpDate() {
        int countPrice = 0;
        int countExpDate = 999;

        if (flowers.isEmpty()) {
            System.out.println("Вы еще ничего не добавили");
        } else {

            for (Flower flower : flowers) {
                countPrice += flower.getPrice();
                if (flower.getExpirationDate() < countExpDate) {
                    countExpDate = flower.getExpirationDate();
                }
            }
        }
        if (aPackage != null) {
            countPrice += aPackage.getPrice();
        }
        System.out.println("Цена букета " + countPrice + " руб. " + "Срок хранения букета " + countExpDate + " дней");
    }
}
