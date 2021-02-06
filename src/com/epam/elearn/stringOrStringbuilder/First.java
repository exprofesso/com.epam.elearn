package com.epam.elearn.stringOrStringbuilder;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class First {

    public static void main(String[] args) {

        String example = " This section    goes into more    detail about how    you should  use   Spring Boot. " +
                "It covers topics such as build systems,    auto-configuration, and how to run    your applications. " +
                "We also    cover some    Spring Boot best practices.    Although    there is    nothing    " +
                "particularly special about Spring Boot (it is just another    library that    you can consume),    " +
                "there    are    a few    recommendations    that, " +
                "when followed, make your      development process    a          little easier   .";

        System.out.println("Самое длинное число пробелов идущих подряд будет равно " + spaceCount(example));

    }

    public static int spaceCount(String text) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                temp++;
            } else if (text.charAt(i) != ' ') {
                if (temp > count) {
                    count = temp;
                }
                temp = 0;
            }
        }
        return count;
    }

}
