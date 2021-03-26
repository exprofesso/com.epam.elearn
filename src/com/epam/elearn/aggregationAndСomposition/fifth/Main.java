package com.epam.elearn.aggregationAndСomposition.fifth;

/*
5. Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ToureConstructor pegas = new ToureConstructor("Pegas");

        Client sergey = new Client("Sergey", 5680);

        pegas.addTourePackade(new TourePackage("USA", "NY", TourPackageType.SHOPPING, Transport.PLANE, Food.NOT_FOOT, 14, 2579));

        pegas.addTourePackade(new TourePackage("USA", "LA", TourPackageType.FITNESS, Transport.CAR, Food.NOT_FOOT, 21, 5423));

        pegas.addTourePackade(new TourePackage("USA", "Miami", TourPackageType.CRUISE, Transport.SHIP, Food.ALL_INCLUSIVE, 10, 4321));

        pegas.addTourePackade(new TourePackage("Italy", "Roma", TourPackageType.EXCURSION, Transport.BUS, Food.BREAKFAST, 7, 900));

        pegas.addTourePackade(new TourePackage("USA", "Miami", TourPackageType.SCIENTIFIC, Transport.BOOSTER, Food.ALL_INCLUSIVE, 5, 2543279));

        pegas.addTourePackade(new TourePackage("Italy", "Pisa", TourPackageType.SCIENTIFIC, Transport.TRAIN, Food.NOT_FOOT, 3, 379));

        pegas.addTourePackade(new TourePackage("Italy", "Pisa", TourPackageType.EXCURSION, Transport.PLANE, Food.ALL_INCLUSIVE, 6, 764));

        pegas.addTourePackade(new TourePackage("Ukraine", "Kiev", TourPackageType.SHOPPING, Transport.BUS, Food.NOT_FOOT, 3, 54));

        pegas.addTourePackade(new TourePackage("Ukraine", "Lviv", TourPackageType.EXCURSION, Transport.CAR, Food.BREAKFAST, 2, 199));

        pegas.addTourePackade(new TourePackage("Ukraine", "Dnepr", TourPackageType.SCIENTIFIC, Transport.PLANE, Food.ALL_INCLUSIVE, 4, 259));

        pegas.addTourePackade(new TourePackage("Ukraine", "Odessa", TourPackageType.CRUISE, Transport.SHIP, Food.ALL_INCLUSIVE, 10, 799));

        pegas.addTourePackade(new TourePackage("Belarus", "Grodno", TourPackageType.FITNESS, Transport.BUS, Food.ALL_INCLUSIVE, 6, 59));


        System.out.println("Выбрать экскурсии");
        ArrayList<TourePackage> selectByType = pegas.selectByTourePackege(TourPackageType.EXCURSION);
        ToureConstructor.printListTourePackage(selectByType);



        System.out.println("Выбрать те что на коробле ");
        ArrayList<TourePackage> selectByOption = pegas.selectMoreTransport(Transport.SHIP);
        ToureConstructor.SortNumberOfDay(selectByOption);
        ToureConstructor.printListTourePackage(selectByOption);
//
//        System.out.println("Выбрать путевки где поездка на автобусе, все включено и 8 дней");
//        selectByOption = pegas.selectMoreTransport(Transport.BUS, Food.ALL_INCLUSIVE, 6);
//        ToureConstructor.sortByPrice(selectByOption);
//        ToureConstructor.printListTourePackage(selectByOption);

//        System.out.println("\nSelect for 5 days:");
//        selectByOption = pegas.selectMoreTransport(7);
//        ToureConstructor.sortByPrice(selectByOption);
//        ToureConstructor.printListTourePackage(selectByOption);

        pegas.addClients(sergey, selectByOption.get(0));



    }
}
