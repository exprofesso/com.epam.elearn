package com.epam.elearn.linearPrograms;

// 1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
public class First {
    public static void main(String[] args) {
        zFunction(5, 6, 4);
    }

    public static Double zFunction(double a, double b, double c) {
        return ((a - 3) * (b / 2)) + c;
    }
}
