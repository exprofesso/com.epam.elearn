package com.epam.elearn.simplestClasses;

/*
5. Опишите класс, реализующий десятичный счетчик,
который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */

import java.util.Random;

public class Fifth {
    public static void main(String[] args) {

        Counter counter = new Counter(1, 40, 1);
        Counter counter1 = new Counter(87, 100, 15);
        Counter counter2 = new Counter();

        for (int i = 0; i < counter.getMax(); i++) {
            System.out.println(counter);
            counter.increase();
        }

        for (int i = counter1.getValue(); i >= counter1.getMin(); i--) {
            System.out.println(counter1);
            counter1.reduction();
        }

        counter2.countRandom();

        System.out.println(Counter.status(counter));
        System.out.println(Counter.status(counter1));
        System.out.println(Counter.statusRandom(counter2));


    }
}

class Counter {
    private int value;
    private int valueRandom;
    private int max;
    private int min;

    public Counter() {
    }

    public Counter(int value, int max, int min) {
        this.value = value;
        this.max = max;
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setValueRandom(int countRandom) {
        this.valueRandom = valueRandom;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int countMin) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Счетчик = " + value;
    }

    // увелечение величины счетчика
    void increase() {
        if(value < max){
            value++;
        } else if (value == max) {
            System.out.println("Вот мы и пришли к верхнему приделу");
        }
//        else if (count > countMax) {
//            System.out.println("Вы вышли за предел");
//            count--;
//        }
    }

    // уменьшение величины счетчика
    void reduction() {
        if(value > min){
            value--;
        } else if (value == min) {
            System.out.println("Вот вы и пришли к нижнему пределю");
        }
//        else if (count < countMin) {
//            System.out.println("Вы вышли за предел");
//            count++;
//        }
    }

    public static String status(Counter counter) {
        return counter.toString();
    }

    public static String statusRandom(Counter counter) {
        return "Count{count=" + counter.valueRandom + "}";
    }


    // значение счетчика, мин. и макс значения задано рандомно и проход в обе стороны с попытной выйти за пределы
    void countRandom() {
        Random random = new Random();
        int tempRandom = random.nextInt(100);
        int tempMax = random.nextInt(100);
        int tempMin = random.nextInt(100);

        while (tempRandom < tempMin || tempRandom > tempMax) {
            tempRandom = random.nextInt(100);
            tempMax = random.nextInt(100);
            tempMin = random.nextInt(100);
        }
        setValueRandom(tempRandom);
        setMax(tempMax);
        setMin(tempMin);
        System.out.println("min " + tempMin);
        System.out.println("ran " + tempRandom);
        System.out.println("max " + tempMax);

        System.out.println("*******");
        System.out.println("Пошли вверх");
        for (int i = valueRandom; i <= max + 1; i++) {
            valueRandom++;
            if (valueRandom == max) {
                System.out.println("Вот мы и пришли к верхнему приделу");
                System.out.println(valueRandom);
            }
//            else if (countRandom > countMax) {
//                System.out.println("Вы вышли за предел");
//                countRandom--;
//            } else {
//                System.out.println(countRandom);
//                countRandom++;
//            }
        }
        System.out.println("А теперь пошли вниз");
        for (int i = max; i >= min - 1; i--) {
            valueRandom--;
            if (valueRandom == min) {
                System.out.println("Вот мы и пришли к нижнему приделу");
                System.out.println(valueRandom);
//                countRandom--;
//            } else if (countRandom < countMin) {
//                System.out.println("Вы вышли за предел");
//                countRandom++;
//            } else {
//                System.out.println(countRandom);
//                countRandom--;
            }
        }

    }
//    public static void main(String[] args) {
//
//        Count count = new Count(1, 40, 1);
//        Count count1 = new Count(87, 100, 15);
//        Count count2 = new Count();
//
//        for (int i = 0; i <= count.getCountMax(); i++) {
//            System.out.println(count);
//            count.increase();
//        }
//
//        for (int i = count1.getCountMax(); i >= count1.getCountMin(); i--) {
//            System.out.println(count1);
//            count1.reduction();
//        }
//
//        count2.countRandom();
//
//        System.out.println(Count.status(count));
//        System.out.println(Count.status(count1));
//        System.out.println(Count.statusRandom(count2));
//
//
//    }
//}
//
//class Count {
//    private int count;
//    private int countRandom;
//    private int countMax;
//    private int countMin;
//
//    public Count() {
//    }
//
//    public Count(int count, int countMax, int countMin) {
//        this.count = count;
//        this.countMax = countMax;
//        this.countMin = countMin;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public int getCountRandom() {
//        return countRandom;
//    }
//
//    public void setCountRandom(int countRandom) {
//        this.countRandom = countRandom;
//    }
//
//    public int getCountMax() {
//        return countMax;
//    }
//
//    public void setCountMax(int countMax) {
//        this.countMax = countMax;
//    }
//
//    public int getCountMin() {
//        return countMin;
//    }
//
//    public void setCountMin(int countMin) {
//        this.countMin = countMin;
//    }
//
//    @Override
//    public String toString() {
//        return "Count{" +
//                "count=" + count +
//                '}';
//    }
//
//    // увелечение величины счетчика
//    void increase() {
//        if (count == countMax) {
//            System.out.println("Вот мы и пришли к верхнему приделу");
//        } else if (count > countMax) {
//            System.out.println("Вы вышли за предел");
//            count--;
//        }
//        count++;
//    }
//
//    // уменьшение величины счетчика
//    void reduction() {
//        if (count == countMin) {
//            System.out.println("Вот вы и пришли к нижнему пределю");
//        } else if (count < countMin) {
//            System.out.println("Вы вышли за предел");
//            count++;
//        }
//        count--;
//    }
//
//    public static String status(Count count) {
//        return count.toString();
//    }
//
//    public static String statusRandom(Count count) {
//        return "Count{count=" + count.countRandom + "}";
//    }
//
//
//    // значение счетчика, мин. и макс значения задано рандомно и проход в обе стороны с попытной выйти за пределы
//    void countRandom() {
//        Random random = new Random();
//        int tempRandom = random.nextInt(100);
//        int tempMax = random.nextInt(100);
//        int tempMin = random.nextInt(100);
//
//        while (tempRandom < tempMin || tempRandom > tempMax) {
//            tempRandom = random.nextInt(100);
//            tempMax = random.nextInt(100);
//            tempMin = random.nextInt(100);
//        }
//        setCountRandom(tempRandom);
//        setCountMax(tempMax);
//        setCountMin(tempMin);
//        System.out.println("min " + tempMin);
//        System.out.println("ran " + tempRandom);
//        System.out.println("max " + tempMax);
//
//        System.out.println("*******");
//        System.out.println("Пошли вверх");
//        for (int i = countRandom; i <= countMax + 1; i++) {
//            if (countRandom == countMax) {
//                System.out.println("Вот мы и пришли к верхнему приделу");
//                System.out.println(countRandom);
//                countRandom++;
//            } else if (countRandom > countMax) {
//                System.out.println("Вы вышли за предел");
//                countRandom--;
//            } else {
//                System.out.println(countRandom);
//                countRandom++;
//            }
//        }
//        System.out.println("А теперь пошли вниз");
//        for (int i = countMax; i >= countMin - 1; i--) {
//            if (countRandom == countMin) {
//                System.out.println("Вот мы и пришли к нижнему приделу");
//                System.out.println(countRandom);
//                countRandom--;
//            } else if (countRandom < countMin) {
//                System.out.println("Вы вышли за предел");
//                countRandom++;
//            } else {
//                System.out.println(countRandom);
//                countRandom--;
//            }
//        }
//
//    }
}
