package com.epam.elearn.oneDimensionalArrays;

import java.util.Random;

/*
8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
 */
public class Eighth {
    public static void main(String[] args) {

        int[] arr = generateArray(15);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("_____________");
        int[] minArr = deleteMinValue(arr);

        for (int ele : minArr) {
            System.out.print(ele + " ");
        }


    }

    public static int[] deleteMinValue(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив нулевой длины!");
        }

        int minCount = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];

            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        return result;
    }

    private static int[] generateArray(int num) {
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }

}
