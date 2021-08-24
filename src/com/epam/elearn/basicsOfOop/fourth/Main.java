package com.epam.elearn.basicsOfOop.fourth;

import com.epam.elearn.basicsOfOop.fourth.cave.Cave;

/*
Дракон и его сокровища.
Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.


 */
public class Main {
    public static void main(String[] args) {
        Cave dragon = new Cave();


        dragon.showTreasure();
        System.out.println("**************");
        dragon.mostExpensive();
    }
}
