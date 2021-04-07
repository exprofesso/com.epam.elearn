package com.epam.elearn.basicsOfOop.second;

import java.util.ArrayList;
import java.util.Collections;

public class Payment {
    private Receipt receipt;
    private double balance;


    public Payment(Product... product) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        Collections.addAll(productArrayList, product);
        receipt = new Receipt(productArrayList);
        int temp = (int) receipt.getBalance() * 100;
        balance = (double) temp / 100;
        System.out.println(receipt.getBalance());
        // System.out.println(balance);
    }

    public void getPayment(double deposit) {
        if (balance < deposit) {
            System.out.println("Ваш платеж " + deposit);
            double temp = deposit - balance;
            System.out.println("Ваши изменения  " + temp);
        } else if (balance == deposit) {
            System.out.println("Ваш платеж " + deposit);
            System.out.println("Большое спасибо что без сдачи");
        } else {
            System.out.println("Ваш платеж " + deposit);
            balance -= deposit;
            System.out.println("Ваш баланс остался " + balance);
        }

    }


    public static class Receipt {
        private ArrayList<Product> products;
        private double balance;

        public Receipt(ArrayList<Product> products) {
            this.products = products;
            balance = getTotalPrice();
        }

        public double getTotalPrice() {
            double totalPrice = 0.0;
            for (Product product : products) {
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }

        public void addReceipt(Product product) {
            products.add(product);
        }

        public void delReceipt(Product product) {
            products.remove(product);
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Receipt " +
                    "products = " + products +
                    ", balance = " + balance;
        }
    }
}

