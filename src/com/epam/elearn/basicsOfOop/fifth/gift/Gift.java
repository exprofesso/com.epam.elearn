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
        if (aPackage.getPrice() > 0) {
            countPrice += aPackage.getPrice();
        }
        for (Sweet sweet : sweets) {
            countCal += sweet.getCalories();
            countPrice += sweet.getPrice();
        }
        return "Подарок '" + name + "' " + countCal + " Ккал. " + countPrice + "руб.";
    }


    //    Вывод всех сладостей и упаковок из подарка
    public void viewWholeGift() {
        int countCal = 0;
        int countPrice = 0;

        for (Sweet sweet : sweets) {
            countCal += sweet.getCalories();
            countPrice += sweet.getPrice();
            System.out.println(sweet.getName() + " " + sweet.getCalories() + "Ккал. " + sweet.getPrice() + "руб.");
        }
        if (aPackage.getPrice() > 0) {
            countPrice += aPackage.getPrice();
            System.out.println(aPackage.getName() + " " + aPackage.getSize() + "см. " + aPackage.getSize() + "руб.");
        }
        System.out.println("Подарок '" + name + "' " + countCal + " Ккал. " + countPrice + "руб.");
    }
}
