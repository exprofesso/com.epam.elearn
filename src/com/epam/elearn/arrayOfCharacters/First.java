package com.epam.elearn.arrayOfCharacters;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class First {
    public static void main(String[] args) {

        String[] camelCase = {"lessoNs", "organIsed", "leVels", "inTeractive", "communiCate"};
        String[] snakeCase = snake_case(camelCase);

        System.out.println(Arrays.toString(camelCase));

        System.out.println(Arrays.toString(snakeCase));
    }

    public static String[] snake_case(String[] camelCase) {

        String[] snake_case = new String[camelCase.length];
        for (int i = 0; i < snake_case.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char lettle = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(lettle)) {
                    stringBuilder.append(lettle);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(lettle));
                }
            }
            snake_case[i] = stringBuilder.toString();
        }
        return snake_case;
    }
}


