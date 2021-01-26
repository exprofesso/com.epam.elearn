package com.epam.elearn.arraysOfArrays;

// 7. Сформировать квадратную матрицу порядка N по правилу:

// и подсчитать количество положительных элементов в ней.

public class Seventh {

    public static void main(String[] args) {
        int n = 12;

        double[][] matrix = new double[n][n];
        int positive = 0; //количество положительных эелементов

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / n); //заполнение матрицы элементами по формуле
                System.out.printf("%14f", matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) { //подсчет количества положительных элементов
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    positive++;
                }
            }
        }
        System.out.println();
        System.out.println("Количество положительных елементов: " + positive);
    }


    }

