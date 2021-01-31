package com.epam.elearn.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

// 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Thirteenth {
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

        int buffer;
        boolean trigger = true; //переключатель

        System.out.println("Сортировка по возрастанию ");
        for (int i = 0; i < array.length; i++) {//столбцы
            trigger = false;
            while (!trigger) {
                trigger = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[j][i] > array[j + 1][i]) {
                        trigger = false;
                        buffer = array[j][i];
                        array[j][i] = array[j + 1][i];
                        array[j + 1][i] = buffer;
                    }
                }
            }
        }


        for (int i = 0; i < array.length; i++) { //вывод первой матрицы
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Сортировка по убыванию ");
        for (int i = 0; i < array.length; i++) {//столбцы
            trigger = false;
            while (!trigger) {
                trigger = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[j][i] < array[j + 1][i]) {
                        trigger = false;
                        buffer = array[j][i];
                        array[j][i] = array[j + 1][i];
                        array[j + 1][i] = buffer;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) { //вывод второй матрицы
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
