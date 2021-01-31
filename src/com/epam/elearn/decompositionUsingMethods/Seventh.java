package com.epam.elearn.decompositionUsingMethods;

// 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Seventh {

    public static void main(String[] args) {
        int factorial[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int summa = 0;

        for (int i = 0; i < factorial.length; i++) {
            if (factorial[i] % 2 != 0) {
                summa = summa + factorial(factorial[i]);
            }
        }
        System.out.println(summa);
    }

    public static int factorial(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }

}
