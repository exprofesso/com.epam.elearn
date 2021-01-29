package com.epam.elearn.decompositionUsingMethods;

import java.util.Scanner;

// 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Sixth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первое число");
        int a = scanner.nextInt();
        System.out.println("Укажите второе число");
        int b = scanner.nextInt();
        System.out.println("Укажите третье число");
        int c = scanner.nextInt();

        System.out.println(comparison(a, b, c));
    }

    public static boolean comparison(int a, int b, int c) {
        int nod = 0;
        for (int i = 1; i <= a || i <= b || i <= c; i++) {

            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;

            }
        }
        if (nod < 1) {
            System.out.println(nod);
            return false;
        } else {
            return true;
        }
    }

}
