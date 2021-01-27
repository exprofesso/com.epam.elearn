package com.epam.elearn.arraysOfArrays;

// 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Random;
import java.util.Scanner;

public class Fifteenth {
    public static void main(String[] args) {

        int max_temp_int = 0;
        int max_int = 0;


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //формирование матрицы
        System.out.println("Введите количество строк и столбцов: ");
        int matrix = scanner.nextInt();


        int array[][] = new int[matrix][matrix];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = -10 + random.nextInt(21);
                System.out.printf(array[i][j] + "  ");

            }
            System.out.println();
        }
        //поиск наибольшего элемента
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max_temp_int) {
                    max_temp_int = array[i][j];
                }

            }
            if (max_temp_int > max_int) {
                max_int = max_temp_int;

            }

        }
        System.out.println("Максимальный элемент матрицы " + max_int);

        // замена все нечетные элемены на максимальное

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max_int;
                }
            }
        }

        //вывод новой матрицы
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
