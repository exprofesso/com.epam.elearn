package com.epam.elearn.basicsOfOop.fourth.bouquet;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        Flower roza = new Flower("Роза", 44, 12);
        Flower landyshi = new Flower("Ландыши", 30, 6);
        Flower romashki = new Flower("Ромашки", 25, 8);
        Package paper = new Package("Бумага", 5);
        System.out.println(roza);
        Bouquet bouquet = new Bouquet("Букет");
        bouquet.addFlower(roza);
        bouquet.addFlower(landyshi);
        bouquet.addFlower(romashki);
        bouquet.setaPackage(paper);
        bouquet.countBouqet();
        bouquet.countExpirationDate();
        bouquet.priceAndExpDate();
        System.out.println(bouquet.toString());
        }

}
