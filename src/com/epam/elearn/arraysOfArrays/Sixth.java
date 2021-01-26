package com.epam.elearn.arraysOfArrays;

// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Sixth {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        int k1 = 0; //число, уменьшающее количество ячеек с единицами

        for (int i = 0; i < array.length; i++) { //заполнение первой половины матрицы

            for (int j = k1; j < array[i].length - k1; j++) {
                array[i][j] = 1;
            }
            n = n - 2;
            k1++;

            if (n < 2) {
                break;
            }
        }

        if (n == 0) {

            for (int i = k1; i < array.length; i++) { //заполнение второй половины матрицы
                for (int j = k1 - 1; j < array[i].length - k1 + 1; j++) {
                    array[i][j] = 1;
                }
                k1--;
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
    }

