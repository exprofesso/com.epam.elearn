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

    //  вывод в консоль колличество регионов
    public void countRegion(){
        System.out.println("Колличество областей в данной стране  " + region.length);
    }
    //  вывод в консоль территории страны
    public void areaCountry(){
        int area = 0;
        for (int i = 0; i < region.length; i++){
            area += region[i].getArea();
        }
        System.out.println("Площадь страны равна " + area);
    }

}
