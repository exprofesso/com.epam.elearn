package com.epam.elearn.linearPrograms;


import static java.lang.Math.cos;
import static java.lang.Math.sin;

// 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Third {
    public static void main(String[] args) {
        System.out.println(trig(2, 1));
    }

    public static double trig(double x, double y) {
        if ((x >= 0.0) && (y >= 0.0)) {
            return ((sin(x) + cos(y)) / (cos(x) - sin(y))) / (sin(x * y) / cos(x * y));
        }
        System.out.println("Укажите положительное значение");
        return 0;
    }
}
