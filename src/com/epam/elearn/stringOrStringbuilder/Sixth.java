package com.epam.elearn.stringOrStringbuilder;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Sixth {

    public static void main(String[] args) {

        String space = " This section    goes into more    detail about how    you should  use   Spring Boot. " +
                "It covers topics such as build systems,    auto-configuration, and how to run    your applications. " +
                "We also    cover some    Spring Boot best practices.    Although    there is    nothing    " +
                "particularly special about Spring Boot (it is just another    library that    you can consume),    " +
                "there    are    a few    recommendations    that, " +
                "when followed, make your    development process    a little easier   .";

        System.out.println(twin(space));


    }

    public static String twin(String a) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            stringBuilder.append(a.charAt(i));
            stringBuilder.append(a.charAt(i));
            if (a.charAt(i) == ' ') {
                stringBuilder.deleteCharAt(i);
            }
        }

        String answer = stringBuilder.toString();
        return answer;
    }
}
