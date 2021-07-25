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
        TourConstructor pegas = new TourConstructor("Pegas");

        Client sergey = new Client("Sergey", 5680);

        pegas.addTourPackage(new TourPackage("USA", "NY", TourPackageType.SHOPPING, Transport.PLANE, Food.NOT_FOOT, 14, 2579));

        pegas.addTourPackage(new TourPackage("USA", "LA", TourPackageType.FITNESS, Transport.CAR, Food.NOT_FOOT, 21, 5423));

        pegas.addTourPackage(new TourPackage("USA", "Miami", TourPackageType.CRUISE, Transport.SHIP, Food.ALL_INCLUSIVE, 10, 4321));

        pegas.addTourPackage(new TourPackage("Italy", "Roma", TourPackageType.EXCURSION, Transport.BUS, Food.BREAKFAST, 7, 900));

        pegas.addTourPackage(new TourPackage("USA", "Miami", TourPackageType.SCIENTIFIC, Transport.BOOSTER, Food.ALL_INCLUSIVE, 5, 2543279));

        pegas.addTourPackage(new TourPackage("Italy", "Pisa", TourPackageType.SCIENTIFIC, Transport.TRAIN, Food.NOT_FOOT, 3, 379));

        pegas.addTourPackage(new TourPackage("Italy", "Pisa", TourPackageType.EXCURSION, Transport.PLANE, Food.ALL_INCLUSIVE, 6, 764));

        pegas.addTourPackage(new TourPackage("Ukraine", "Kiev", TourPackageType.SHOPPING, Transport.BUS, Food.NOT_FOOT, 3, 54));

        pegas.addTourPackage(new TourPackage("Ukraine", "Lviv", TourPackageType.EXCURSION, Transport.CAR, Food.BREAKFAST, 2, 199));

        pegas.addTourPackage(new TourPackage("Ukraine", "Dnepr", TourPackageType.SCIENTIFIC, Transport.PLANE, Food.ALL_INCLUSIVE, 4, 259));

        pegas.addTourPackage(new TourPackage("Ukraine", "Odessa", TourPackageType.CRUISE, Transport.SHIP, Food.ALL_INCLUSIVE, 10, 799));

        pegas.addTourPackage(new TourPackage("Belarus", "Grodno", TourPackageType.FITNESS, Transport.BUS, Food.ALL_INCLUSIVE, 6, 59));

        pegas.addTourPackage(new TourPackage("Belarus", "Vitebsk", TourPackageType.EXCURSION, Transport.CAR, Food.NOT_FOOT, 3, 99));

        System.out.println("Выбрать экскурсии");
        ArrayList<TourPackage> selectByType = pegas.selectByTourPackege(TourPackageType.EXCURSION);
        TourConstructor.printListTourPackage(selectByType);


        System.out.println("Выбрать те что на коробле ");
        ArrayList<TourPackage> selectByOption = pegas.selectMoreTransport(Transport.SHIP);
        TourConstructor.SortNumberOfDay(selectByOption);
        TourConstructor.printListTourPackage(selectByOption);

        System.out.println("Выбрать путевки где поездка на автобусе, все включено и 8 дней");
        selectByOption = pegas.selectMoreTransport(Transport.BUS, Food.ALL_INCLUSIVE, 6);
        TourConstructor.sortByPrice(selectByOption);
        TourConstructor.printListTourPackage(selectByOption);

        System.out.println("\nSelect for 5 days:");
        selectByOption = pegas.selectMoreTransport(7);
        TourConstructor.sortByPrice(selectByOption);
        TourConstructor.printListTourPackage(selectByOption);

        pegas.addClients(sergey, selectByOption.get(0));


    }
}
