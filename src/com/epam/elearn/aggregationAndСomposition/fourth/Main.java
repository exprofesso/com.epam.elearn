package com.epam.elearn.aggregationAndСomposition.fourth;

/*
4. Счета. Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {
    public static void main(String[] args) {

        Bank priorBank = new Bank("Prior Bank");

        Client Ivanov = new Client("Dima", "Ivanov", "1235567");
        Client Petrov = new Client("Ivan", "Petrov", "4723685");
        Client Kuznecoff = new Client("Sergey", "Kuznecoff", "3428674");

        priorBank.addNewClient(Ivanov);
        priorBank.addNewClient(Petrov);
        priorBank.addNewClient(Kuznecoff);

        Ivanov.openAccount(new Account(46328.43));
        Ivanov.openAccount(new Account(3647821.32));
        Ivanov.openAccount(new Account(321));

        Petrov.openAccount(new Account(-312));
        Petrov.openAccount(new Account(-243));
        Petrov.openAccount(new Account(-32));

        Kuznecoff.openAccount(new Account(334));
        Kuznecoff.openAccount(new Account(213.14));
        Kuznecoff.openAccount(new Account(69649));


        // блокировка счета
        System.out.println(priorBank.getClient("1235567").getAccount(2).getStatus());
        priorBank.getClient("1235567").blockAccount(2);
        System.out.println(priorBank.getClient("1235567").getAccount(2).getStatus());


        // сортировка счетов
        System.out.println(priorBank.getClient("3428674").getInfoAccount());
        priorBank.getClient("3428674").sortBalance();
        System.out.println(priorBank.getClient("3428674").getInfoAccount());
        priorBank.getClient("1235567").sortBalance();
        System.out.println(priorBank.getClient("1235567").getInfoAccount());
        priorBank.getClient("4723685").sortBalance();
        System.out.println(priorBank.getClient("4723685").getInfoAccount());

        // расчет общей суммы счетов
        System.out.println(Ivanov.toString() + " Всего денег " + Ivanov.getBalance());
        System.out.println(Petrov.toString() + " Всего денег " + Petrov.getBalance());
        System.out.println(Kuznecoff.toString() + " Всего денег " + Kuznecoff.getBalance());


        // расчет положительных счетов
        System.out.println(Ivanov.toString() + " Positive " + Ivanov.getPositiveBalance());
        System.out.println(Petrov.toString() + " Positive " + Petrov.getPositiveBalance());
        System.out.println(Kuznecoff.toString() + " Positive " + Kuznecoff.getPositiveBalance());


        // расчет отрицательных счетов
        System.out.println(Ivanov.toString() + " Negative " + Ivanov.getNegativeBalance());
        System.out.println(Petrov.toString() + " Negative " + Petrov.getNegativeBalance());
        System.out.println(Kuznecoff.toString() + " Negative " + Kuznecoff.getNegativeBalance());


    }
}
