package com.epam.elearn.arraysOfArrays;

// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.


import java.util.Random;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк ");
        int strings = scanner.nextInt();

        System.out.println("Введите количество столбцов ");
        int columns = scanner.nextInt();

        int[][] a = new int[strings][columns];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = (int) (random.nextInt(40));
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        // выбор искомой строки и столбца
        System.out.println("Введите номер строки");
        int k = scanner.nextInt() - 1;
        System.out.println("Введите номер столбца");
        int p = scanner.nextInt() - 1;

        // проверка, что номер строки и столбца находится в пределах массива
        if (k >= strings || p >= columns) {
            System.out.println("Выход за пределы массива");
        } else {
            // поиск выбранной строки
            System.out.println("Выбранная строка:");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (i == k) {

                        System.out.print(a[i][j] + " ");
                    }

                }
                System.out.println();
            }
            // поиск столбца
            System.out.println("Выбранный столбец: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (j == p) {
                        System.out.print(a[i][j] + " ");
                    }

                }
                System.out.println();
            }

        }
        scanner.close();
    }
}
