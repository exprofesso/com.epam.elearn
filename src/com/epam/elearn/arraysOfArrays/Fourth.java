package com.epam.elearn.arraysOfArrays;


// 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class Fourth {

    static int n,k,num;


    public static void main(String[] argv)  {

        Scanner s = new Scanner(System.in);

        n=s.nextInt(); k=1;num=n;

        int [] [] arr = new int  [n] [n];

        for(int i =0;i<arr.length;i++) {
            if(i%2==0) {
                for(int j =0;j<arr.length;j++) {
                    arr[i][j]=k;k++;
                }k=1;
            }
            else {
                for(int j =0;j<arr.length;j++) {
                    arr[i][j]=num;num--;;
                }num=n;
            }
        }

        for(int i =0;i<arr.length;i++) {
            for(int  j =0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }



    }
}
