package com.epam.elearn.simplestClasses;

/*
6. Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */


public class Sixth {

    public static void main(String[] args) {
        Time time = new Time(42);
        Time time1 = new Time(543, 66);
        Time time2 = new Time(52, 2345, 523);

        System.out.println(time.toString());
        System.out.println(time1.toString());
        System.out.println(time2.toString());

        time.setHour(13);
        time1.setMinute(24);
        time2.setSecond(41);

        System.out.println(time.toString());
        System.out.println(time1.toString());
        System.out.println(time2.toString());

    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public Time(int hour) {
        if (hour < 24 && hour > 0) {
            this.hour = hour;
        } else {
            hour = 0;
            this.hour = 0;
        }

        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute) {
        if (hour < 24 && hour > 0) {
            this.hour = hour;
        } else {
            hour = 0;
            this.hour = hour;
        }
        if (minute < 60 && minute > 0) {
            this.minute = minute;
        } else {
            minute = 0;
            this.minute = minute;
        }
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        if (hour < 24 && hour > 0) {
            this.hour = hour;
        } else {
            hour = 0;
            this.hour = 0;
        }
        if (minute < 60 && minute > 0) {
            this.minute = minute;
        } else {
            minute = 0;
            this.minute = minute;
        }

        if (second < 60 && second > 0) {
            this.second = second;
        } else {
            second = 0;
            this.second = 0;
        }
    }

    public void setHour(int hour) {
        if (hour < 24 && hour > 0) {
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
        if (minute < 60 && minute > 0) {
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
        if (second < 60 && second > 0) {
            this.second = second;
        } else {
            second = 0;
            this.second = second;
        }

    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
