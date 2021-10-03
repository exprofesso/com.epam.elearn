package com.epam.elearn.cycles;

// 6. Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Sixth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите первое натуральное число");
        int m = scanner.nextInt();
        System.out.println("Укажите второе натуральное число");
        int n = scanner.nextInt();
        division(m, n);
    }

    public static void division(int m, int n) {
        while (m < n) {
            System.out.print(m + ": ");
            for (int i = 2; i < m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
            m++;
        }
    }
}
