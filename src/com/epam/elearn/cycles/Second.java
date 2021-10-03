package com.epam.elearn.cycles;

import java.util.Scanner;

// 2. Вычислить значения функции на отрезке [а,b] c шагом h:
public class Second {

    public static void main(String[] args) {
        inputInt();
    }


    public static void inputInt() {
        int a;
        int b;
        int h;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите пункт A");
        a = scanner.nextInt();
        System.out.println("Укажите пункт B");
        b = scanner.nextInt();
        System.out.println("Укажите пункт H");
        h = scanner.nextInt();

        System.out.println("Значения функции на отрезке " + function(a, b, h));

    }

    public static long function(int a, int b, int h) {
        long minimal = 0;
        long maximum = 0;

        for (long i = a; i <= b; i += h) {
            if (i <= 2) {
                minimal -= i;
            } else {
                maximum += i;
            }
        }
        return minimal + maximum;
    }
}
