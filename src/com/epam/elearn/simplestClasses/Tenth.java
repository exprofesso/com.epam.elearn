package com.epam.elearn.simplestClasses;

/*
10. Создать класс Airline, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:

a) список рейсов для заданного пункта назначения;

b) список рейсов для заданного дня недели;

c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.util.Date;

public class Tenth {

    public static void main(String[] args) {

    }
}

class Airline {

    private String destination;
    private int number;
    private String type;
    private Date departure;
    private String dayWeek;

    public Airline(String destination, int number, String type, Date departure, String dayWeek) {
        this.destination = destination;
        this.number = number;
        this.type = type;
        this.departure = departure;
        this.dayWeek = dayWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public String getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", departure=" + departure +
                ", dayWeek='" + dayWeek + '\'' +
                '}';
    }


    //    a) список рейсов для заданного пункта назначения;
    public static void toDestination (Airline[] airlines, String destination){
        int count = 0;
        for (int i = 0; i < airlines.length; i++){
            if(airlines[i].destination.equalsIgnoreCase(destination)){
                System.out.println(airlines[i].toString());
                count++;
            }
        } if(count == 0){
            System.out.println("Не летят туда сегодня самолеты и не едут поезда!");
        }


    }
}
