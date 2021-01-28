package com.epam.elearn.sorting;

// 3. Реализуйте сортировку обменами.

public class Third {
    public static void main(String[] args) {

        System.out.println("Сортировка обменом или пузырьковая на Java\"");
        int array[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 9, 5, 10};
        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j > i; j--) {

                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
            System.out.print(array[i] + "\t");
        }
    }
}
