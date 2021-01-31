package com.epam.elearn.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Twelfth {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //формирование матрицы
        System.out.println("Введите количество строк и столбцов: ");
        int matrix = scanner.nextInt();


        int array[][] = new int[matrix][matrix];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = -5 + random.nextInt(11);
                System.out.print(array[i][j] + "  ");

            }
            System.out.println();
        }
        sort(array, true);
        sort(array, false);
    }

    public static void sort(int array[][], boolean a) {
        int buffer;
        boolean trigger = true; //переключатель

        if (a) {
            System.out.println("Сортировка по возрастанию ");
        } else {
            System.out.println("Сортировка по убыванию ");
        }

        for (int i = 0; i < array.length; i++) {
            trigger = false;
            while (!trigger) {
                trigger = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if ((a && array[i][j] > array[i][j + 1]) || (!a && array[i][j] < array[i][j + 1])) {
                        trigger = false;
                        buffer = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = buffer;
                    }
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
