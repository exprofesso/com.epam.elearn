package com.epam.elearn.basicsOfOop.fifth.gift;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    private String name;
    private List<Sweet> sweets = new ArrayList<>();
    private Package aPackage;

    public Gift(String name) {
        this.name = name;
    }

    public Gift(String name, List<Sweet> sweets) {
        this.name = name;
        this.sweets = sweets;
    }

    public Gift(String name, List<Sweet> sweets, Package aPackage) {
        this.name = name;
        this.sweets = sweets;
        this.aPackage = aPackage;
    }

    public String getName() {
        return name;
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public void addPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    @Override
    public String toString() {
        int countCal = 0;
        int countPrice = 0;
        if (aPackage.price > 0) {
            countPrice += aPackage.price;
        }
        for (Sweet sweet : sweets) {
            countCal += sweet.calories;
            countPrice += sweet.price;
        }
        return "Подарок '" + name + "' " + countCal + " Ккал. " + countPrice + "руб.";
    }


    //    Вывод всех сладостей и упаковок из подарка
    public void viewWholeGift() {
        int countCal = 0;
        int countPrice = 0;

        for (Sweet sweet : sweets) {
            countCal += sweet.calories;
            countPrice += sweet.price;
            System.out.println(sweet.name + " " + sweet.calories + "Ккал. " + sweet.price + "руб.");
        }
        if (aPackage.price > 0) {
            countPrice += aPackage.price;
            System.out.println(aPackage.name + " " + aPackage.size + "см. " + aPackage.price + "руб.");
        }
        System.out.println("Подарок '" + name + "' " + countCal + " Ккал. " + countPrice + "руб.");
    }
}
