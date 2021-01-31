package com.epam.elearn.decompositionUsingMethods;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */

public class Thirteenth {


    public static void main(String[] args) {

        int mass[] = {4, 11, 13, 8, 13, 45, 47, 71, 75};
        simple(mass);
    }

    //поиск пары простых чисел
    public static int simple(int a[]) {
        int i = 0;
        int first = 0;
        int second = 0;

        for (; i < a.length; i++) {

            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j != 0) {
                    continue;

                } else {
                    j = 1;
                    first = 0;
                    if (i < a.length - 1) {
                        i++;
                    } else {
                        break;
                    }
                }
            }

            if (first != 0) {
                second = a[i];
            } else {
                first = a[i];
            }

            if (first != 0 && second != 0) {
                two(first, second, i);
                first = 0;
                second = 0;
            }

        }
        return -1;
    }


    // нахождение разности
    public static int two(int first, int second, int i) {

        int difference = Math.abs(first - second);
        if (difference == 2) {
            end(first, second);
        }
        return i;
    }

    //вывод пары чисел
    public static void end(int first, int second) {
        System.out.println(first + " " + second);
    }
}

