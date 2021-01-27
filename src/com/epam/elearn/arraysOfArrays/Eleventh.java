package com.epam.elearn.arraysOfArrays;

/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

import java.util.Random;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {

        Random random = new Random();
        int count = 0;

        int array[][] = new int[10][20];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = random.nextInt(16);
                System.out.printf("%10d", array[i][j]);

            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Номер строки, в которой число 5 встречается три и более раз: " + i);
            }
        }


    }
}
