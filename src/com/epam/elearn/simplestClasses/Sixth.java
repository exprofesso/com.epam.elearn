package com.epam.elearn.simplestClasses;

/*
6. Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */


public class Sixth {


}

class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public Time(int hour) {
        if (hour > 24 || hour < 0) {
            this.hour = hour;
        }
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute) {
        if (hour > 24 || hour < 0) {
            this.hour = hour;
            if (minute > 60 || minute < 0) {
                this.minute = minute;
            } else {
                minute = 0;
                this.minute = minute;
            }
        } else {
            hour = 0;
            this.hour = hour;
        }
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 24 || hour > 0) {
            this.hour = hour;
        } else {
            hour = 0;
            this.hour = hour;
            //System.out.println("Вы вышли за предел");
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 60 || minute > 0) {
            this.minute = minute;
        } else {
            minute = 0;
            this.minute = 0;
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 60 || second > 0) {
            this.second = second;
        } else {
            second = 0;
            this.second = second;
        }

    }
}
