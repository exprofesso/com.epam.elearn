package com.epam.elearn.sorting;

// 2. Реализуйте сортировку выбором.

public class Second {
    public static void main(String[] args) {

        System.out.println("Сортировка выбором на Java");

        int array[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 10, 5, 5};

        for (int i = 0; i < array.length; i++) {

            int min_idx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
            System.out.print(array[i] + "\t");
        }
    }
}
