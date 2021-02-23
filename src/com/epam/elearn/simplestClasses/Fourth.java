package com.epam.elearn.simplestClasses;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train,
добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

import java.util.Arrays;

public class Fourth {

    public static void main(String[] args) {

        Train[] trains = new Train[10];

        trains[0] = new Train("Brest", "12", "17:25");
        trains[1] = new Train("Gomel", "10", "17:25");
        trains[2] = new Train("Vitebsk", "16", "17:25");
        trains[3] = new Train("Grodno", "11", "17:25");
        trains[4] = new Train("Mogilev", "21", "17:25");
        trains[5] = new Train("Brest", "22", "17:25");
        trains[6] = new Train("Vitebsk", "32", "17:25");
        trains[7] = new Train("Grodno", "61", "17:25");
        trains[8] = new Train("Mogilev", "76", "17:25");
        trains[9] = new Train("Vitebsk", "19", "17:25");


        sortNumber(trains);
        System.out.print(Arrays.toString(trains));


        System.out.println("\n**********\n");

        System.out.println(Train.toSee(trains, "32"));

    }

    // сортировка по номеру поезда
    public static void sortNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].number.compareTo(trains[j].number) > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

}

class Train {
    String city;
    String number;
    String timeGo;

    public Train() {
    }

    public Train(String city, String number, String timeGo) {
        this.city = city;
        this.number = number;
        this.timeGo = timeGo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setTimeGo(String timeGo) {
        this.timeGo = timeGo;
    }

    public String getTimeGo() {
        return timeGo;
    }

    @Override
    public String toString() {
        return "\nTrain { city = " + city + " " + "number = " + number + " timeGo = " + timeGo + "}";
    }


    // вывод информации о конкретном поезде
    public static String toSee(Train[] trains, String number) {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].number.equalsIgnoreCase(number)) {
                return "Информация о поезде " + number + " станция прибытия " + trains[i].city + " время отправления " + trains[i].timeGo;
            }
        }
        return null;
    }
}
