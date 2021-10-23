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

    //    a) список рейсов для заданного пункта назначения;
    public static void sortByDestination(Airline[] airlines, String destination) {
        int count = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equalsIgnoreCase(destination)) {
                System.out.println(airlines[i].toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Не летят туда сегодня самолеты и не едут поезда!");
        }
    }


    // b) список рейсов для заданного дня недели;

    public static void sortByWeekDay(Airline[] airlines, String weekDay) {
        String dW = weekDay.trim().toLowerCase();
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getWeekDay().equalsIgnoreCase(weekDay)) {
                System.out.println(airlines[i].toString());
            }
        }
    }

    // c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
    public static void sortByWeekDayDeparture(Airline[] airlines, String weekDay, Date departure) {

        Airline[] temp = new Airline[airlines.length];
        int count = 0;
        String wD = weekDay.trim().toLowerCase();
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getWeekDay().equalsIgnoreCase(weekDay)) {
                temp[count] = airlines[i];
                count++;
            }
        }
        for (int j = 0; j < count; j++) {
            int sort = temp[j].getDeparture().compareTo(departure);
            if (sort > 0) {
                System.out.println(temp[j].toString());
            }
        }

    }

    public static void main(String[] args) {
        Airline[] airlines = new Airline[10];
        airlines[0] = new Airline("Moscow", 10, "big", new Date(1516161616141L), "Monday");
        airlines[1] = new Airline("Kiev", 15, "little", new Date(1212151616141L), "Friday");
        airlines[2] = new Airline("Riga", 21, "little", new Date(1313141616141L), "Friday");
        airlines[3] = new Airline("Moscow", 11, "little", new Date(1616131616141L), "Friday");
        airlines[4] = new Airline("Kiev", 16, "little", new Date(1616111216141L), "Monday");
        airlines[5] = new Airline("Riga", 37, "big", new Date(1616121611141L), "Monday");
        airlines[6] = new Airline("Riga", 54, "little", new Date(1616101316141L), "Friday");
        airlines[7] = new Airline("Kiev", 34, "little", new Date(1616151716141L), "Monday");
        airlines[8] = new Airline("Kiev", 19, "big", new Date(1613161016141L), "Friday");
        airlines[9] = new Airline("Riga", 14, "little", new Date(1613141016141L), "Monday");


        // a) список рейсов для заданного пункта назначения;
        Tenth.sortByDestination(airlines, "riga");
        System.out.println("*************");

        // b) список рейсов для заданного дня недели;
        Tenth.sortByWeekDay(airlines, "monday");
        System.out.println("**************");

        // c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
        Tenth.sortByWeekDayDeparture(airlines, "friday", new Date(1212151616141L));

    }
}

class Airline {

    private String destination;
    private int number;
    private String type;
    private Date departure;
    private String weekDay;

    public Airline(String destination, int number, String type, Date departure, String weekDay) {
        this.destination = destination;
        this.number = number;
        this.type = type;
        this.departure = departure;
        this.weekDay = weekDay;
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

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return "Airline = " +
                "destination = " + destination +
                ", number = " + number +
                ", type = " + type +
                ", departure = " + departure +
                ", weekDay = " + weekDay;
    }


//    //    a) список рейсов для заданного пункта назначения;
//    public static void toDestination(Airline[] airlines, String destination) {
//        int count = 0;
//        for (int i = 0; i < airlines.length; i++) {
//            if (airlines[i].destination.equalsIgnoreCase(destination)) {
//                System.out.println(airlines[i].toString());
//                count++;
//            }
//        }
//        if (count == 0) {
//            System.out.println("Не летят туда сегодня самолеты и не едут поезда!");
//        }
//    }
//
//
//    // b) список рейсов для заданного дня недели;
//
//    public static void dayWeek(Airline[] airlines, String dayWeek) {
//        String dW = dayWeek.trim().toLowerCase();
//        for (int i = 0; i < airlines.length; i++) {
//            if (airlines[i].dayWeek.equalsIgnoreCase(dayWeek)) {
//                System.out.println(airlines[i].toString());
//            }
//        }
//    }
//
//    // c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
//    public static void dayWeekDeparture(Airline[] airlines, String dayWeek, Date departure) {
//
//        Airline[] temp = new Airline[airlines.length];
//        int count = 0;
//        String dW = dayWeek.trim().toLowerCase();
//        for (int i = 0; i < airlines.length; i++) {
//            if (airlines[i].dayWeek.equalsIgnoreCase(dayWeek)) {
//                temp[count] = airlines[i];
//                count++;
//            }
//        }
//        for (int j = 0; j < count; j++) {
//            int sort = temp[j].departure.compareTo(departure);
//            if (sort > 0) {
//                System.out.println(temp[j].toString());
//            }
//        }
//
//    }

}
