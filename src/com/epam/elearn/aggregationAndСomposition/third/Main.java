package com.epam.elearn.aggregationAndСomposition.third;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {
        Town Kiev = new Town("Kiev", 2_800_000);
        Country Ukraine = new Country("Ukraine", Kiev);

        Ukraine.addRegion(new Region("Odessa obl", 45, new Town("Odessa", 1_030_000)));
        Ukraine.addRegion(new Region("Nikolaev obl", 56, new Town("Nikolaev", 935_000)));
        Ukraine.addRegion(new Region("Dnepr obl", 78, new Town("Dnepr", 6_543_000), new Town("Nikopol'", 147_000)));
        Ukraine.addRegion(new Region("Lviv obl", 40, new Town("Lviv", 2_478_680)));
        Ukraine.addRegion(new Region("Suma obl", 25, new Town("Suma", 764_570)));
        Ukraine.addRegion(new Region("Uzgorod obl", 19, new Town("Uzgorod", 198_000), new Town("Mukachev", 57_000)));


        Ukraine.capitalToString();

        Ukraine.countRegion();

        Ukraine.areaCountry();

        Ukraine.regionCentre();

        Ukraine.countryPopulation();


    }
}
