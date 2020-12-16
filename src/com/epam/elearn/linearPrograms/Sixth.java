package com.epam.elearn.linearPrograms;

/*
6. Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */
public class Sixth {

    public static void main(String[] args) {
        System.out.println(seaBattle(1.4, 0.7));
    }

    public static boolean seaBattle(double x, double y){
        return (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }
}
