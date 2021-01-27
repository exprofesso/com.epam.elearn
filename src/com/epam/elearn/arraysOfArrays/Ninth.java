package com.epam.elearn.arraysOfArrays;

/*
9. Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */

import java.util.Random;
import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Укажите размер матрицы");
        int n = scanner.nextInt();

        int [][] array =  new int[n][n];
        int answer = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
                count +=array[i][j];
                System.out.print(array[i][j]);
            }
            if(count > answer){
                answer = count;

            }
            count = 0;
            System.out.println("");
        }

        System.out.println(answer);

    }
}
