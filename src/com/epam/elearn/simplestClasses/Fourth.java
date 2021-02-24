package com.epam.elearn.simplestClasses;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train,
добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Fourth {

    private static SimpleDateFormat format = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) throws ParseException {


        Train[] trains = new Train[10];

        trains[0] = new Train("Brest", "12", format.parse("17:35"));
        trains[1] = new Train("Gomel", "10", format.parse("16:56"));
        trains[2] = new Train("Vitebsk", "16", format.parse("18:41"));
        trains[3] = new Train("Grodno", "11", format.parse("10:11"));
        trains[4] = new Train("Mogilev", "21", format.parse("22:19"));
        trains[5] = new Train("Brest", "22", format.parse("23:06"));
        trains[6] = new Train("Vitebsk", "32", format.parse("19:55"));
        trains[7] = new Train("Grodno", "61", format.parse("13:35"));
        trains[8] = new Train("Mogilev", "76", format.parse("11:17"));
        trains[9] = new Train("Vitebsk", "19", format.parse("16:38"));


        sortNumber(trains);
        System.out.print(Arrays.toString(trains));


        System.out.println("\n**********\n");

        System.out.println(Train.toSee(trains, "32"));

        System.out.println("**********");

        sortCity(trains);
     //   System.out.print(Arrays.toString(trains));
//        System.out.println();
//        for(int i = 0; i < trains.length; i++){
//            System.out.println(trains[i].city + " " + trains[i].number + " " + format.format(trains[i].timeGo));
//        }
        sortTime(trains, "Vitebsk");

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

    public static void sortCity(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int comper = trains[i].city.compareToIgnoreCase(trains[j].city);
                if (comper > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (comper == 0) {
                    if (trains[i].city.compareToIgnoreCase(trains[j].city) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

    public static void sortTime(Train[] trains, String city) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].city.equalsIgnoreCase(city)) {
                    int comper = trains[i].timeGo.compareTo(trains[j].timeGo);
                    if (comper > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    } else if (comper == 0) {
                        if (trains[i].timeGo.compareTo(trains[j].timeGo) > 0) {
                            temp = trains[i];
                            trains[i] = trains[j];
                            trains[j] = temp;
                        }
                    }
                }
            }
        }
    }

}

class Train {
    String city;
    String number;
    Date timeGo;

    public Train(String city, String number, Date timeGo) {
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

    public void setTimeGo(Date timeGo) {
        this.timeGo = timeGo;
    }

    public Date getTimeGo() {
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
