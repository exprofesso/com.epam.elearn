package com.epam.elearn.basicsOfOop.second;

/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Bread", 42390812, 9);
        Product product1 = new Product("Milk", 74213987, 15);
        Product product2 = new Product("Banane", 34215124, 22);
        Product product3 = new Product("Beer", 3426236, 44);
        Product product4 = new Product("Pact", 23414000, 1);

        Payment payment = new Payment(product, product2, product3, product4);
        payment.getPayment(90);
        payment.getPayment(11);

        System.out.println("*****************");

        Payment payment1 = new Payment(product, product4);
        payment1.getPayment(10);


        System.out.println("*************");

        Payment payment2 = new Payment(product, product1, product2, product4);
        payment2.getPayment(10);
        payment2.getPayment(5);

        System.out.println("****************");

    }
}
