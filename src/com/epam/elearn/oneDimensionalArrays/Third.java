package com.epam.elearn.oneDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

/*
3. Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Third {

    public static void main(String[] args) {
        negativeAndPositive();
    }

    public static void negativeAndPositive() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива");
        int z = scanner.nextInt();
        int[] array = new int[z];

        int zero = 0;
        int posirive = 0;
        int negative = 0;

        enterArrayRandom(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                posirive++;
            } else if(array[i] < 0) {
                negative++;
            } else
                zero++;
            }


        System.out.println("Количество положительных чисел : " + posirive);
        System.out.println("Количество отрицательных чисел: " + negative);
        System.out.println("Количество 0 : " + zero);
        System.out.println();
    }

    public static void enterArrayRandom(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt();
            System.out.println(mas[i]);
        }
    }


}
