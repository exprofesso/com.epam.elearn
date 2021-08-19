package com.epam.elearn.basicsOfOop.fourth.bouquet;

public class Flower {
    String name;
    int price;
    int expirationDate;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public Flower(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Неизвестный";
        }

    }

    public Flower(String name, int price) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Неизвестный";
        }
        if (price > 1) {
            this.price = price;
        } else {
            this.price = 10;
        }
    }

    public Flower(String name, int price, int expirationDate) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Неизвестный";
        }
        if (price > 1) {
            this.price = price;
        } else {
            this.price = 10;
        }
        if (expirationDate > 3) {
            this.expirationDate = expirationDate;
        } else {
            this.expirationDate = 3;
        }
    }

    @Override
    public String toString() {
        return "Цветок " + name + " " + "по цене = " + price + " руб., сроком годности " + expirationDate + " дней";
    }
}
