package com.epam.elearn.decompositionUsingMethods;

/*
17. Из заданного числа вычли сумму его цифр.
Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Seventeenth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число");
        int n = scanner.nextInt();
        scanner.close();

//        int count = 0;
//        int number = n;
//        while (number > 0) {
//            sumOfDigits(number);
//            substract();
//            System.out.println(subtraction);
//            count++;
//        }
        int count = 0;
        int number = n;

        while (number > 0) {
            number = number - sumOfDigits(number);
            System.out.println(number);
            count++;
        }
        System.out.println("Всего произведено " + count + " действий");

    }

    private static int sumOfDigits(int number) {
        int totalSum = 0;
        int newNumber = number;
        while (newNumber >= 1) {
            int buf2 = newNumber - ((newNumber / 10) * 10);
            totalSum = totalSum + buf2;
            newNumber = newNumber / 10;
        }
        return totalSum;
    }

//    private static int substract(int number, int totalSum) {
//        int subtraction = number - totalSum;
//        number = subtraction;
//        return subtraction;
//    }

//    private static int sumOfDigits() {
//        totalSum = 0;
//        int newNumber = number;
//        while (newNumber >= 1) {
//            int buf2 = newNumber - ((newNumber / 10) * 10);
//            totalSum = totalSum + buf2;
//            newNumber = newNumber / 10;
//        }
//        return totalSum;
//    }
//
//    private static int substract() {
//        subtraction = number - totalSum;
//        number = subtraction;
//        return subtraction;
//    }

}
