package com.epam.elearn.cycles;

import java.util.Scanner;

// 5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Fifth {
    public static void main(String[] args) {
        charIndex();
    }


    public static void charIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите символ");
        String simvol = scanner.nextLine();
        int x = (char) simvol.charAt(0);
        System.out.println(simvol + " char index " + x);
    }
}
