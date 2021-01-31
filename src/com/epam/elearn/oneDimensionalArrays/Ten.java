package com.epam.elearn.oneDimensionalArrays;

/*
10. Дан целочисленный массив с количеством элементов п. Сжать массив,
выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 */

public class Ten {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6, 8, 5, 3, 9, 2, 1, 6, 7, 9};
        int littleAraray[] = littleArray(arr);
        for (int i = 0; i < littleAraray.length; i++) {
            System.out.print(littleAraray[i]);
        }
    }

    public static int[] littleArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

}
