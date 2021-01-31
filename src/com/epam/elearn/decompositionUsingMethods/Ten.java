package com.epam.elearn.decompositionUsingMethods;

/*
10. Дано натуральное число N.
Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число для заполнения");
        String num = scanner.nextLine();
        array(num);
    }


    public static void array(String n) {

        int length = String.valueOf(n).length();
        long num = Long.parseLong(n);
        long array[] = new long[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = num % 10;
            num /= 10;
            System.out.print(array[i] + " ");
        }
    }
}
