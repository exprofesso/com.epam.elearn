package com.epam.elearn.sorting;

// 5. Реализуйте сортировку Шелла.
public class Fifth {
    public static void main(String[] args) {

        int arr[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 9, 5, 10, 22, 17};

        // сортировка

        int buffer;
        int left = 0;
        int right = arr.length - 1;

        do {
            for (int i = left; i < right; i++){
                if(arr[i] > arr [i + 1]){
                    buffer = arr[i];
                    arr [i] = arr[i + 1];
                    arr [i + 1] = buffer;
                }
            }
            right --;
            for ( int i = right; i > left; i-- ){

                if (arr [i] < arr [i - 1]){
                    buffer = arr[i];
                    arr [i] = arr[i - 1];
                    arr [i - 1] = buffer;
                }
            }
            left++;
        } while (left < right);

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
