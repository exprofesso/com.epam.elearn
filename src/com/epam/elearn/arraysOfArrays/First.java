package com.epam.elearn.arraysOfArrays;


// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import java.util.Random;

public class First {

    public static void main(String[] args) {

        arrays(5, 9);

    }

    public static void arrays(int m, int n) {
        int[][] matrixA;
        Random random = new Random();
        matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + " - matrix row: ");
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = random.nextInt(9) + 1;
                System.out.print(matrixA[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("answer" + "\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (matrixA[0][j] > matrixA[m - 1][j]) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

}
