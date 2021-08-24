package com.epam.elearn.basicsOfOop.fifth.gift;

public class Sweet {
    private String name;
    private int calories;
    private int price;

    public Sweet(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Сахар";
        }
        this.calories = 100;
        this.price = 0;
    }

    public Sweet(String name, int price) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Сахар";
        }
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
        this.calories = 100;
    }

    public Sweet(String name, int calories, int price) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Сахар";
        }
        if (calories > 10) {
            this.calories = calories;
        } else {
            this.calories = 10;
        }
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    @Override
    public String toString() {
        return name + " - " + calories + "Ккал. " + price + "руб.";
    }
}
