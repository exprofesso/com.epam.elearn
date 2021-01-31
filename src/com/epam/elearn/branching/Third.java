package com.epam.elearn.branching;

/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Third {
    public static void main(String[] args) {
        System.out.println(straightLine(1, 2.0, 2, 3.0, 3, 4.0));
    }

    public static boolean straightLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1))) == 0;
    }
}
