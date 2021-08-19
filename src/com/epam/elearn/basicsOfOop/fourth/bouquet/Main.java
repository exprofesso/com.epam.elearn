package com.epam.elearn.basicsOfOop.fourth.bouquet;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        Flower roza = new Flower("Роза", 44, 2);
        Flower landyshi = new Flower("Ландыши", 30, 6);
        System.out.println(roza);
        Bouquet bouquet = new Bouquet("Букет");
        bouquet.addFlower(roza);
        bouquet.addFlower(landyshi);
        bouquet.countBouqet();
    }


}
