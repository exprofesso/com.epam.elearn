package com.epam.elearn.arraysOfArrays;


import java.util.Random;
import java.util.Scanner;

// 10. Найти положительные элементы главной диагонали квадратной матрицы.
public class Ten {

    public static void main(String[] args)  {

       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
        //формирование матрицы
        System.out.println("Введите количество строк и столбцов: ");
        int matrix = scanner.nextInt();


        int array[][] = new int[matrix][matrix];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = -5 + random.nextInt(11);
                System.out.printf(array[i][j] + "  ");

            }
            System.out.println();
        }

        for (int i = 0, j = 0; i < array.length; i++, j++) { //поиск положительных элементов главной диагонали матрицы

            if (array[i][j] > 0) {
                System.out.print(array[i][j] + " ");
            }
        }
    }


}
