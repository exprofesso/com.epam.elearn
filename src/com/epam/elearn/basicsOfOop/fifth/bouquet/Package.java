package com.epam.elearn.basicsOfOop.fifth.bouquet;

public class Package {
    private String name;
    private int price;

    public Package() {
        this.name = "Без упаковк";
        this.price = 0;
    }

    public Package(String name, int price) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Без упаковки";
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Упаковка " + name + " " + " цена " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
