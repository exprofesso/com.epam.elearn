package com.epam.elearn.decompositionUsingMethods;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Sixteenth {

    public static void main(String[] args) {

        int count = 0;
        int even = 0;

        for(int i = 10; i <= 99; i++){
            if(i % 2 != 0) {
                count = count + i;
             //   System.out.println(i)
            }
        }
        System.out.println("Сумма нечетных чисел " + count);

        while (count > 2) {
            count = count / 10;
            if(count % 2 == 0) {
                even++;
                System.out.println(count);
                System.out.println("_________");
            }
        }

        System.out.println("Колличество четных чисел " + even);
    }

}
