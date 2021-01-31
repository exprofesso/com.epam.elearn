package com.epam.elearn.sorting;

/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.
 */
public class First {
    public static void main(String[] args) {

        int array1[] = {2, 5, 6, 9, 11, 45, 70};
        int array2[] = {7, 14, 224, 235};
        int k = 3;

        for (int i = 0; i < array1.length; i++) {
            if (i < k) {
                System.out.println(array1[i] + " ");
            } else if (i == k) {
                for (int j = 0; j < array2.length; j++) {
                    System.out.println(array2[j] + " ");
                }
            } else {
                System.out.println(array1[i] + " ");
            }
        }
    }
}
