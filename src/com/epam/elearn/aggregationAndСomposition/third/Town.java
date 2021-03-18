package com.epam.elearn.aggregationAndСomposition.third;

public class Town {
    private String name;
    private int population;

    public Town(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString(){
        //return "Name - " + this.name + " population - " + this.population;
        return  name;
    }
}
