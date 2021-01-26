package com.epam.elearn.arraysOfArrays;


//   2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Second {
    public static void main(String[] args) {

        int matrix[][] = {{23, 56, 86, 24},
                {4, 14, 67, 86},
                {1, 89, 5, 34, 22},
                {99, 77, 44, 22, 11}};

        System.out.println(" Элементы стоящие на диагонали :");
        for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][i] + "  ");
                System.out.println();
        }

    }
}
