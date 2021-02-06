package com.epam.elearn.arrayOfCharacters;

// 4. В строке найти количество чисел.

public class Fourh {

    public static void main(String[] args) {
        String example = "good 1day 25, 221but I like 35";

        System.out.println(count(example));
    }

    public static int count(String text) {

        char[] numeral = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean some = false;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < numeral.length; j++) {
                if (text.charAt(i) == numeral[j] & !some) {
                    count++;
                    some = true;
                } else if (text.charAt(i) == ' ') {
                    some = false;
                }
            }
        }
        return count;
    }
}
