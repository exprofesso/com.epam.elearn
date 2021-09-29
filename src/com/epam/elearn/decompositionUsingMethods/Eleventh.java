package com.epam.elearn.decompositionUsingMethods;

// 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Scanner;

public class Eleventh {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первое число");
        String a = scanner.nextLine();
        System.out.println("Укажите второе число");
        String b = scanner.nextLine();

        System.out.println(equality(a, b));
    }

    public static String equality(String a, String b) {

        int first = a.length();
        int second = b.length();
        String answer = "";

        if (first > second) {
            answer = "В первом числе больше цифр";
        } else if (first < second) {
            answer = "Во втором числе больше цифр";
        } else
            answer = "Оба эти числа имею одинаковое число цифр";
        return answer;
    }
}
