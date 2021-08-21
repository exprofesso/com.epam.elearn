package com.epam.elearn.basicsOfOop.fifth.bouquet;

public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower("Роза", 44, 12);
        Flower liliesOfTheValley = new Flower("Ландыши", 30, 6);
        Flower chamomile = new Flower("Ромашки", 25, 8);
        Flower lily = new Flower("Лилия", 38, 4);
        Flower tulip = new Flower("Тюльпан", 15, 5);
        Flower cornflowers = new Flower("Васильки");

        Package paper = new Package("Бумага", 5);

        Bouquet forest = new Bouquet("Лесной");
        Bouquet romantic = new Bouquet("Романтичный");

        forest.addFlower(chamomile);
        forest.addFlower(liliesOfTheValley);
        forest.addFlower(cornflowers);
        forest.setaPackage(paper);


        romantic.addFlower(rosa);
        romantic.addFlower(lily);
        romantic.addFlower(tulip);
        romantic.setaPackage(paper);


        forest.countBouqet();
        forest.countExpirationDate();
        forest.priceAndExpDate();
        System.out.println(forest.toString());


        romantic.countBouqet();
        romantic.countExpirationDate();
        romantic.priceAndExpDate();
        System.out.println(romantic.toString());


    }

}
