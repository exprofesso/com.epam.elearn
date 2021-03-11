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
    public static void toDestination(Airline[] airlines, String destination) {
        int count = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].destination.equalsIgnoreCase(destination)) {
                System.out.println(airlines[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Не летят туда сегодня самолеты и не едут поезда!");
        }
    }

    // b) список рейсов для заданного дня недели;

    public static void dayWeek(Airline[] airlines, String dayWeek) {
        String dW = dayWeek.trim().toLowerCase();
        for (int i = 0; i < airlines.length; i++) {
            switch (dW) {
                case "monday":
                    System.out.println(airlines[i].toString());
                    break;
                case "tuesday":
                    System.out.println(airlines[i].toString());
                    break;
                case "wednesday":
                    System.out.println(airlines[i].toString());
                    break;
                case "thursday":
                    System.out.println(airlines[i].toString());
                    break;
                case "friday":
                    System.out.println(airlines[i].toString());
                    break;
                case "saturday":
                    System.out.println(airlines[i].toString());
                    break;
                case "sunday":
                    System.out.println(airlines[i].toString());
                    break;
                default:
                    System.out.println("Данного дня не существует");
                    break;
            }
        }
    }

    // c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
    public static void dayWeekDeparture(Airline[] airlines, String dayWeek, Date departure) {

        Airline[] temp = new Airline[];
        int count = 0;
        String dW = dayWeek.trim().toLowerCase();
        for (int i = 0; i < airlines.length; i++) {
            switch (dW) {
                case "monday":
                    temp[count] = airlines[i];
                    count++;
                    break;
                case "tuesday":
                    temp[count] = airlines[i];
                    count++;
                    break;
                case "wednesday":
                    temp[count] = airlines[i];
                    count++;
                    break;
                case "thursday":
                    temp[count] = airlines[i];
                    count++;
                    break;
                case "friday":
                    temp[count] = airlines[i];
                    count++;
                    break;
                case "saturday":
                    temp[count] = airlines[i];
                    count++;
                    break;
                case "sunday":
                    temp[count] = airlines[i];
                    count++;
                    break;
                default:
                    System.out.println("Данного дня не существует");
                    break;
            }
        }
        for (int j = 0; j < temp.length; j++) {
            int sort = temp[j].departure.compareTo(departure);
            if (sort > 0) {
                System.out.println(temp[j].toString());
            }
        }

    }

}
