package com.epam.elearn.stringOrStringbuilder;

// 3. Проверить, является ли заданное слово палиндромом.

public class Third {
    public static void main(String[] args) {

        String example = "Шалаш";
        String example1 = "Шашки";

        System.out.println(palindrom(example) + " " + palindrom(example1));

    }

    public static boolean palindrom(String a) {
        boolean palendrom = false;
        for (int i = 0; i < a.length() / 2; i++) {
            String first = String.valueOf(a.charAt(i));
            String second = String.valueOf(a.charAt(a.length() - i - 1));
            if (first.equalsIgnoreCase(second)) {
                palendrom = true;
            }
        }
        return palendrom;
    }

}
