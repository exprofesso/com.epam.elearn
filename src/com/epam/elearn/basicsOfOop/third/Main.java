package com.epam.elearn.basicsOfOop.third;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;

// Создать класс Календарь с внутренним классом,
// с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
public class Main {
    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.addHoliday(MonthDay.of(Month.JANUARY, 7));
        calendar.addHoliday(MonthDay.of(Month.MARCH, 8));
        calendar.addHoliday(MonthDay.of(Month.MAY, 1));
        calendar.addHoliday(MonthDay.of(Month.MAY, 9));
        calendar.addHoliday(MonthDay.of(Month.DECEMBER, 31));

        calendar.showWeekendAndHolidayBetween(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 2, 1));


        System.out.println(LocalDateTime.now());
        System.out.println(MonthDay.now());
    }

}
