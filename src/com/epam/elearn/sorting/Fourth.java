package com.epam.elearn.sorting;

// 4. Реализуйте сортировку вставками.

public class Fourth {
    public static void main(String[] args) {
        System.out.println("Сортировка вставки в Java");
        int arr[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 9, 5, 10, 22, 17};

        // сортировка

        for (int i = 1; i < arr.length; i++){
            int buffer = arr[i];
            int j = i - 1;
            while ( j >= 0 && arr[j] > buffer){

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = buffer;
        }

        // вывод результата
        printArray(arr);
    }

    // метод вывода массива
    public static void printArray(int[] arr){
        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
