package com.epam.elearn.decompositionUsingMethods;

import java.util.Random;
import java.util.Scanner;

/*
8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].

Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
расположенных элементов массива с номерами от k до m.
 */
public class Eighth {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int length = scanner.nextInt();
        System.out.println("Введите границы суммы");
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        int array[] = new int[length];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(sum(array, k, m));
    }

    public static int sum(int a[], int k, int m) {
        if (k > a.length || m > a.length) {
            System.out.println("элементы за пределами массива");
            return -1;
        }
        int three_element = 0;
        for (int i = k; i <= m; i++) {
            three_element = three_element + a[i];
        }
        return three_element;
    }
}
