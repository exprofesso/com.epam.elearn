package com.epam.elearn.branching;

import static java.lang.Math.pow;

// 5. Вычислить значение функции:
public class Fifth {

    public static void main(String[] args) {
        System.out.println(function(2));

    }

    public static double function(int x) {
        if (x <= 3) {
            return pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (pow(x, 2) + 6);
        }
    }
}
