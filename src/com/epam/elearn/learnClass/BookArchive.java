package com.epam.elearn.learnClass;

public class BookArchive {
    public static void main(String[] args) {

        String author = "Lermontov";
        String publishingHouse = "SuperPress";
        int year = 1850;


        Book book1 = new Book(1, "Hobbit", "Tolkien", "SuperPress", 1960, 300, 650, "black");
        Book book2 = new Book(2, "Lord od the Ring", "Tolkien", "SuperPress", 1965, 1600, 950, "red");
        Book book3 = new Book(3, "Mcyr'", "Lermontov", "Novus", 1840, 15, 12300, "white");
        Book book4 = new Book(4, "Heroy", "Lermontov", "Novus", 1841, 25, 20000, "black");
        Book book5 = new Book(5, "Borodino", "Lermontov", "Novus", 1838, 36, 14000, "black");
        Book book6 = new Book(6, "Kavkaz", "Lermontov", "Novus", 1842, 141, 18000, "white");
        Book book7 = new Book(7, "Silmarillion", "Tolkien", "SuperPress", 1968, 640, 300, "red");
        Book book8 = new Book(8, "Two Towers", "Tolkien", "SuperPress", 1980, 299, 650, "black");
        Book book9 = new Book(9, "The Return of the King", "Tolkien", "SuperPress", 1955, 1200, 650, "black");
        Book book10 = new Book(10, "Roverandom", "Tolkien", "SuperPress", 1968, 459, 800, "red");


        Book book[] = new Book[]{book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};
//        for (int i = 0; i < book.length; i++){
//            System.out.println(book[i].toString());
//        }



        System.out.println("****************");
        for (int i = 0; i < book.length; i++) {
            if (book[i].getAuthor().equals(author)) {
                //  System.out.println(book[i].getName());
                System.out.println(book[i].toString());
            }
        }
        System.out.println("****************");
            for (int i = 0; i < book.length; i++) {
                if (book[i].getPublishingHouse().equals(publishingHouse)) {
                    // System.out.println(book[i].getName());
                    System.out.println(book[i]);
                }
            }
        System.out.println("****************");
                for (int i = 0; i < book.length; i++) {
                    if (book[i].getYear() > year) {
                        // System.out.println(book[i].getName());
                        System.out.println(book[i].toString());
                    }
                }
        }


    }

