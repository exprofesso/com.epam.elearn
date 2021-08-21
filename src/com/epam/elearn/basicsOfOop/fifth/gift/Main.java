package com.epam.elearn.basicsOfOop.fifth.gift;

public class Main {
    public static void main(String[] args) {
        Sweet chocolate = new Sweet("Шоколад", 369, 12);
        Sweet candy = new Sweet("Комфета", 85, 2);
        Sweet chupaChups = new Sweet("Чупа-Чупс", 160, 1);
        Sweet biscuits = new Sweet("Печенье", 400, 6);
        Sweet peanut = new Sweet("Арахис", 570, 7);
        Sweet condensedMilk = new Sweet("Сгущеное молоко", 624, 2);
        Sweet marmalade = new Sweet("Мармелад", 110, 5);
        Sweet sherbet = new Sweet("Щербет", 482, 11);
        Package box = new Package("Коробка", 50, 5);


        Gift sweetBox = new Gift("Сладкая коробка");
        sweetBox.addSweet(chocolate);
        sweetBox.addSweet(candy);
        sweetBox.addSweet(chupaChups);
        sweetBox.addSweet(biscuits);
        sweetBox.addSweet(peanut);
        sweetBox.addSweet(condensedMilk);
        sweetBox.addSweet(sherbet);
        sweetBox.addSweet(marmalade);
        sweetBox.addPackage(box);


        System.out.println(sweetBox.toString());

        sweetBox.viewWholeGift();


    }
}
