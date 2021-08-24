package com.epam.elearn.basicsOfOop.fifth.gift;

public class Package {
    private String name;
    private int size;
    private int price;

    public Package() {
        this.name = "Пустота";
    }

    public Package(String name) {
        this.name = name;
        this.size = 5;
        this.price = 10;
    }

    public Package(String name, int price) {
        this.name = name;
        this.size = 5;
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 10;
        }
    }

    public Package(String name, int size, int price) {
        this.name = name;
        if (size > 0) {
            this.size = size;
        } else {
            this.size = 5;
        }
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 10;
        }
    }

    @Override
    public String toString() {
        return "Упаковка " + name + " размер " + size + " цена " + price + " руб.";
    }
}
