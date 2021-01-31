package com.epam.elearn.linearPrograms;


/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class Fifth {

    public static void main(String[] args) {
        System.out.println(hms(580732094));
    }

    public static String hms(int time) {

        int hours = time / (60 * 60);
        int minutes = (time - hours * 60 * 60) / 60;
        int seconds = time - (hours * 60 * 60) - (minutes * 60);

        return hours + " hours " + minutes + " min " + seconds + " sec";
    }
}
