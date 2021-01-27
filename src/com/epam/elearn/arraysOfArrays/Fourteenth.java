package com.epam.elearn.arraysOfArrays;

/*
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */

public class Fourteenth {

    public static void main(String[] args) {

        int n = 10;
        int m = 10;
        int array[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i <= j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
