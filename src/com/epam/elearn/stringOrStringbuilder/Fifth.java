package com.epam.elearn.stringOrStringbuilder;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Fifth {

    public static void main(String[] args) {

        String space = " This section    goes into more    detail about how    you should  use   Spring Boot. " +
                "It covers topics such as build systems,    auto-configuration, and how to run    your applications. " +
                "We also    cover some    Spring Boot best practices.    Although    there is    nothing    " +
                "particularly special about Spring Boot (it is just another    library that    you can consume),    " +
                "there    are    a few    recommendations    that, " +
                "when followed, make your    development process    a little easier   .";

        System.out.println(count(space));
    }

    public static int count(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == 'a')) {
                count++;
            }
        }
        return count;
    }
}
