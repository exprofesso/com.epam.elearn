package com.epam.elearn.basicsOfOop.fourth.bouquet;

public class Package {
    String name;
    int price;

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
        return "Упаковка " + name + " " + " ценв" + price;
    }
}
