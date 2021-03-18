package com.epam.elearn.aggregationAndСomposition.third;

public class Сountry {
    private String nameСountry;
    private Town capital;
    private Region[] region;


    public Сountry(String nameСountry, Town capital, Region[] region) {
        this.nameСountry = nameСountry;
        this.capital = capital;
        this.region = region;
    }

    // вывод в консоль столицы страны
    public void capitalToString (){
        capital.toString();
    }
}
