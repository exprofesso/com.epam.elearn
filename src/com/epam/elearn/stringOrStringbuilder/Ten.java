package com.epam.elearn.stringOrStringbuilder;

/*
10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */

public class Ten {

    public static void main(String[] args) {

        String example = "Do You ever. Make phone calls! or leave voicemail? messages in English!";

        System.out.println(count(example));

    }

    public static int count(String a) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char point = a.charAt(i);
            if (point == '.' || point == '?' || point == '!') {
                count++;
            }
        }
        System.out.print("В данном тексте предложений ");
        return count;
    }
}
