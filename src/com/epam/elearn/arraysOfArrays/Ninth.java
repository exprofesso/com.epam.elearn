package com.epam.elearn.arraysOfArrays;

/*
9. Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */

import java.util.Random;
import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //формирование матрицы
        System.out.println("ведите количество строк и столбцов");
        int strings = scanner.nextInt();

        int a[][] = new int[strings][strings];

        int sum[] = new int[strings];
        int max_sum_column = 0;
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = (int) (Math.random() * 10);
                System.out.printf("%10d", a[i][j]);
            }
            System.out.println();

        }
        for (int i = 0; i < a.length; i++) {//столбцы
            for (int j = 0; j < a[i].length; j++) {//строки
                sum[i] = sum[i] + a[j][i];
            }

        }

        for (int i = 0; i < a.length - 1; i++) {
            if (sum[i] > max) {
                max = sum[i];
                max_sum_column = i;
            }
        }


        System.out.println(max_sum_column + 1);
    }
}
