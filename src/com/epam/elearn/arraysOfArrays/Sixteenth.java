package com.epam.elearn.arraysOfArrays;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат.
 */

import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] magicSquare;
        int n;

        System.out.println("Введите порядок магического квадрата");
        n = scanner.nextInt();

        while (n < 2) {

            System.out.println("Магический квадрат данного порядка невозможен, введите другое значение");
            n = scanner.nextInt();
        }
        if ((n - 1) % 2 == 0) {//первый случай для нечетного n
            magicSquare = unevenMagicSquare(n);
        } else if (n % 4 == 0) {//второй случай для кратных 4
            magicSquare = fourMagicSquare(n);
        } else { //третий случай
            magicSquare = evenOddMagicSquare(n);
        }
        printMatrix(magicSquare);//вывод
    }

    private static int[][] unevenMagicSquare(int n) { //метод для первого случая
        int[][] magic = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        magic[i--][j++] = 1;
        for (int k = 2; k <= n * n; i--, j++, k++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (magic[i][j] != 0) {
                i += 2;
                j--;
            }
            magic[i][j] = k;
        }
        return magic;
    }
    //второй случай для кратных 4

    private static int[][] fourMagicSquare(int n) {
        int[][] magic = new int[n][n];
        int temp;
        int k = 1;

        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic.length; j++) {
                magic[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i += 4) {
            for (int j = 1; j < n; j += 4) {
                magic[i][j] = n * n + 1 - magic[i][j];
                magic[i + 3][j] = n * n + 1 - magic[i + 3][j];
                magic[i][j + 1] = n * n + 1 - magic[i][j + 1];
                magic[i + 3][j + 1] = n * n + 1 - magic[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4) {
            for (int j = 0; j < n; j += 4) {
                magic[i][j] = n * n + 1 - magic[i][j];
                magic[i + 1][j] = n * n + 1 - magic[i + 1][j];
                magic[i][j + 3] = n * n + 1 - magic[i][j + 3];
                magic[i + 1][j + 3] = n * n + 1 - magic[i + 1][j + 3];
            }
        }
        return magic;
    }
            // третий вариант
    private static int[][] evenOddMagicSquare(int n) {
        int[][] magic = new int[n][n];
        int[][] magicNNN = fourMagicSquare(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                magic[i][j] = magicNNN[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int m = n / 2;
        int d = n * n + 1;

        magic[0][0] = 3 * m - 1;
        magic[0][n - 1] = 1;
        magic[n - 1][0] = d - 1;
        magic[n - 1][n - 1] = d - 3 * m + 1;

        int i, j;
        for (i = 1; i <= m - 2; i++) {
            magic[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= m; j++) {
            magic[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            magic[n - 1][j] = n * n + 1 - magic[0][j];
        }
        magic[1][0] = 2 * m - 1;
        for (i = 1; i <= m / 2; i++) {
            magic[i + 1][0] = 3 * m - 1 - i;
        }
        i--;
        for (j = 1; j <= m / 2 + 1; j++) {
            magic[i + j + 1][0] = d - 4 * m + 1 + j;
        }
        j--;
        for (int q = 1; q <= m / 2 - 1; q++, i++) {
            magic[i + j + q + 1][0] = 3 * m - 1 + q;
            magic[i + j + q + 2][0] = d - 2 * m - q;
        }

        for (i = 1; i < n - 1; i++) {
            magic[i][n - 1] = n * n + 1 - magic[i][0];
        }

        return magic;
    }

    private static void printMatrix(int[][] square) {
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }


    }
}