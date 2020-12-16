package com.epam.elearn.branching;

/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
public class Fourth {
    public static void main(String[] args) {
        System.out.println(brick(4,4, 2,2,2));
    }


    public static boolean brick(int A, int B, int x, int y, int z) {
        if((A >= x && B >= y) || (A >= x && B >= z) || (A >= z && B >= y) ||
                (A >= y && B >= x) || (A >= z && B >= x) || (A >= y && B >= z)) {
            return true;
        }
        return false;
    }
}
