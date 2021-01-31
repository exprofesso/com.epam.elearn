package com.epam.elearn.arraysOfArrays;

// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Sixth {
    public static void main(String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        int first = 0;
        int second = n;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i % 2 == 0) {
                    first++;
                    a[i][j] = first;
                    System.out.printf("%3d ", a[i][j]);
                } else {

                    a[i][j] = second;
                    System.out.printf("%3d ", a[i][j]);
                    second--;
                }
            }
            first = 0;
            second = n;
            System.out.println();
        }

    }
}

