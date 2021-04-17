package com.epam.elearn.arrayOfCharacters;

// 4. В строке найти количество чисел.

public class Fourh {

    public static void main(String[] args) {
        String example = "345jklrewjt 54983208.5438 43 55";

        System.out.println("Колличество чисел в строке " + count(example));
    }

    public static int count(String text) {

        boolean some = false;
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if ((text.charAt(i) > 47) & (text.charAt(i) < 58) && (!some)) {
                count++;
                some = true;
            } else if ((text.charAt(i) < 47) || (text.charAt(i) > 58)) {
                some = false;
            }

        }
        return count;

    }
}
