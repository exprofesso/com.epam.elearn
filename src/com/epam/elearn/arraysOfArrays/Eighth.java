package com.epam.elearn.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

/*
 В числовой матрице поменять местами два столбца любых столбца, т. е.
 все элементы одного столбца поставить на соответствующие им позиции другого,
 а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */
public class Eighth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Укажите размер матрицы");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Укажите первый столбец для замены");
        int firs = scanner.nextInt() - 1;
        System.out.println("Укажите второй столбец для замены");
        int second = scanner.nextInt() - 1;

        // int column_first[] = new int[n];
        Integer columnFirst;
        // создание временого массива и замена данных в столбцах
        for (int i = 0; i < array.length; i++) {
            columnFirst = array[i][firs];
            array[i][firs] = array[i][second];
            array[i][second] = columnFirst;
        }
        // вывод итоговый результат
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
