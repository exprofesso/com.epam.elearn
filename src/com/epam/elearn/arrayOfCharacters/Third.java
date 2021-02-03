package com.epam.elearn.arrayOfCharacters;

// 3. В строке найти количество цифр.

public class Third {

    public static void main(String[] args) {
        String example = "good day 2, but I like 3";
        int count = 0;
        char[] numeral = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < example.length(); i++) {
            for (int j = 0; j < numeral.length; j++) {
                if (example.charAt(i) == numeral[j]) {
                    count++;
                }
            }
        }
        System.out.println("В строке цифры встречаеться " + count + " раз");

    }

}
