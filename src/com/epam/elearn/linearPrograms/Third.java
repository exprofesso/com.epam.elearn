package com.epam.elearn.linearPrograms;


import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

// 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите значение для X");
        long x = (long) scanner.nextInt();
        System.out.println("Укажите значение для Y");
        long y = (long) scanner.nextInt();


        System.out.println(trig(x, y));
    }

    public static double trig(double x, double y) {
        if ((x >= 0.0) && (y >= 0.0)) {
            return ((sin(x) + cos(y)) / (cos(x) - sin(y))) / (sin(x * y) / cos(x * y));
        }
        System.out.println("Укажите положительное значение");
        return 0;
    }
}
