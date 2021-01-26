package com.epam.elearn.arraysOfArrays;


//  5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четное n: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                array[i][j] = i + 1;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


