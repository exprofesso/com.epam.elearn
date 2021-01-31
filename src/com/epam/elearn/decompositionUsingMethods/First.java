package com.epam.elearn.decompositionUsingMethods;

import java.util.Scanner;

// 1. Написать метод(методы) для нахождения наибольшего общего делителя и
// наименьшего общего кратного двух натуральных чисел:
public class First {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первое натуральное число");
        int n1 = scanner.nextInt();
        System.out.println("Укажите второе натуральное число");
        int n2 = scanner.nextInt();

        System.out.println("Результат НОД " + nod(n1, n2));
        System.out.println("Результат НОК " + nok(n1, n2));

    }

    public static int nod(int n1, int n2) {
        int nod = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    public static int nok(int n1, int n2) {//Нахождение НОК
        int nod = nod(n1, n2);
        int nok = n1 * n2 / nod;
        return nok;
    }
}
