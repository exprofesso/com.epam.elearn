package com.epam.elearn.oneDimensionalArrays;

import java.util.Random;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class First {

    public static void main(String[] args) {
        int[] arr = generateArray(10000);
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int k = 5;
        int sum = 0;
        for (int a: arr) {
            if (a % k == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

    private static int[] generateArray(int num) {
        int[] arr = new int[num];
        Random rand = new Random();
        for (int i=0; i<num; i++) {
            arr[i]=rand.nextInt(100);
        }
        return arr;
    }

}
