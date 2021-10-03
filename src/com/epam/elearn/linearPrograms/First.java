package com.epam.elearn.linearPrograms;

import java.util.Scanner;

// 1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите значение для A");
        long a = (long) scanner.nextInt();
        System.out.println("Укажите значение для B");
        long b = (long) scanner.nextInt();
        System.out.println("Укажите значение для C");
        long c = (long) scanner.nextInt();
        System.out.println(zFunction(a, b, c));
    }

    public static Double zFunction(double a, double b, double c) {
        return ((a - 3) * (b / 2)) + c;
    }
}
