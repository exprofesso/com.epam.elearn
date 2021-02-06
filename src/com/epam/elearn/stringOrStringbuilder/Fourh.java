package com.epam.elearn.stringOrStringbuilder;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Fourh {

    public static void main(String[] args) {

        String informatika = "информатика";
        System.out.println(cake(informatika));
    }

    public static String cake(String informatika) {

        String inform = "";

        while (!(inform.length() == 4)) {
            inform += String.valueOf(informatika.charAt(informatika.indexOf('т')));
            inform += String.valueOf(informatika.charAt(informatika.indexOf('о')));
            inform += String.valueOf(informatika.charAt(informatika.indexOf('р')));
            inform += String.valueOf(informatika.charAt(informatika.indexOf('т')));
        }
        return inform;
    }
}
