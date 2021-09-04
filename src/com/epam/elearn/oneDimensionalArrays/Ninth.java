package com.epam.elearn.oneDimensionalArrays;

/*
9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */

public class Ninth {

    public static void main(String[] args) {

        int mass[] = {35, 1, 1, 1, 4, 6, 2, 7, 8, 4, 11, 7, 11, 9, 2, 2, 12, 12, 12, 57, 57, 57, 57, 57, 56, 56, 56, 56, 56, 35, 35, 35, 35};
        System.out.println(getMostPopularNumber(mass));
    }


    public static int getMostPopularNumber(int[] data) {
        int[] popular = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = data[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = data[i];
            }
            if ((popResult == popular[i]) && (data[i] < valResult)) {
                valResult = data[i];
            }
        }
        return valResult;

    }

}
