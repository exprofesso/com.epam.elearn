package com.epam.elearn.linearPrograms;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Second {
    public static void main(String[] args) {
        System.out.println(discrim(5, 5, 5));
    }

    public static double discrim(double a, double b, double c) {
        if ((a >= 0) && (b >= 0) && (c >= 0)) {
            return ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - pow(a, 3) * c + pow(b, -2);
        }
        System.out.println("Укажите положительное значение");
        return 0;
    }

}
