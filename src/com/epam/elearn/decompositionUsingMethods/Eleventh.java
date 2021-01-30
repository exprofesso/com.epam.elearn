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
        equality(a, b);
    }

    public static void equality (String a, String b){

        int first = a.length();
        int second = b.length();

        if(first > second){
            System.out.println("В первом числе больше цифр");
        } else  if (first < second){
            System.out.println("Во втором числе больше цифр");
        } else
        System.out.println("Оба эти числа имею одинаковое число цифр");

    }
}
