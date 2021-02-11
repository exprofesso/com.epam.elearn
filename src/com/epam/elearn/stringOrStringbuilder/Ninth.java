package com.epam.elearn.stringOrStringbuilder;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class Ninth {

    public static void main(String[] args) {

        String example = "Do You ever make phone calls or leave voicemail messages in English";

        System.out.println(little(example));
        System.out.println(big(example));

    }

    public static int little(String a) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            if (letter > 96 && letter < 123) {
                count++;
            }
        }
        System.out.print("В данном тексте строчных букв ");
        return count;
    }

    public static int big(String a) {

        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            if (letter > 65 && letter < 90) {
                count++;
            }
        }
        System.out.print("В данном тексте заглавных букв ");

        return count;
    }
}