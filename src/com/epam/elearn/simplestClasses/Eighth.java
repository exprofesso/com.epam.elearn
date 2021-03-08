package com.epam.elearn.simplestClasses;

/*
8. Создать класс Customer, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод  toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

Найти и вывести:

a) список покупателей в алфавитном порядке;

b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Eighth {

    public static void main(String[] args) {

        Customer[] customers = new Customer[10];

        customers[0] = new Customer(1, "Ivanov", "Dima", "Petrovich", "Minsk, Nemiga 21-1-5", 434223451, 112);
        customers[1] = new Customer(2, "Petrov", "Ivan", "Alex","Minsk, Pobedy 41-5-8", 453355329, 115);
        customers[2] = new Customer(3, "Sidoroff", "Sergey", "","Minsk, Lenina 65-9-1", 423455329, 117);
        customers[3] = new Customer(4, "Kuznecof", "Alex", "Ivanovich","Minsk, Gai 221-46", 343453721, 101);
        customers[4] = new Customer(5, "Golub", "Vadim", "Gennadivich","Minsk, Nemiga 1-44", 123764326, 99);
        customers[5] = new Customer(6, "Putin", "Vova", "Petrovich","Minsk, Kolosa 99", 33546324, 454);
        customers[6] = new Customer(7, "Davidof", "Mike", "Nikiforovich","Minsk, Nemiga 61-36", 753456553, 658);
        customers[7] = new Customer(8, "Podkolzin", "Maks", "Anatolivich","Minsk, Radialnaia 3", 343533956, 17);
        customers[8] = new Customer(9, "Gogol", "Nilola", "","Minsk, Pobedy 1-79", 235656745, 154);
        customers[9] = new Customer(10, "Tolstoi", "Lev", "","Minsk, Tanka 1-345", 764635435, 71);

//        for (int i = 0; i < customers.length; i++){
//            System.out.println(customers[i].toString());
//        }
        System.out.println("**********");

        Customer.sortNumber(customers, 400000000, 600000000);
//        for (int i = 0; i < customers.length; i++){
//            System.out.println(customers[i].toString());
//        }

    }
}
class Customer{
    int id;
    String surname;
    String name;
    String patronymic;
    String address;
    int numberCard;
    int numberAccount;

    public Customer(int id, String surname, String name, int numberAccount){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.numberAccount = numberAccount;
    }

    public Customer(int id, String surname, String name, String patronymic, String address, int numberCard, int numberAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCard = numberCard;
        this.numberAccount = numberAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCars() {
        return numberCard;
    }

    public void setNumberCars(int numberCars) {
        this.numberCard = numberCars;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", numberAccount=" + numberAccount +
                '}';
    }

    public static void sortNumber(Customer[] customer, int from, int to) {
        if(from < to){
            for(int i = 0; i < customer.length; i++){
                if(customer[i].numberCard > from && customer[i].numberCard < to){
                    System.out.println(customer[i].toString());
                }
            }
        } else {
            System.out.println("укажите верные данные ");
        }
    }
}
