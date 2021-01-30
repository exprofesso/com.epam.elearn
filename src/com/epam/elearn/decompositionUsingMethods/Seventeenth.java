package com.epam.elearn.decompositionUsingMethods;

/*
17. Из заданного числа вычли сумму его цифр.
Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Seventeenth {

    private static int subtraction;
    private static int n;
    private static int totalSum;
    private static int newN;

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число");
        n = scanner.nextInt();
        scanner.close();

        int count = 0;
        newN = n;
        while (newN > 0){
            sum();
            difference();
            System.out.println(subtraction);
            count++;
        }


    }


    private static int sum() {
        totalSum = 0;
        int buf1 = newN;
        while (buf1 >= 1) {
            int buf2 = buf1 - ((buf1 / 10) * 10);
            totalSum = totalSum + buf2;
            buf1 = buf1 / 10;
        }
        return totalSum;
    }
    private static int difference() {
        subtraction = newN - totalSum;
        newN = subtraction;
        return subtraction;
    }

}
