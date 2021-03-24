package com.epam.elearn.aggregationAndСomposition.fifth;

/*
5. Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {
    public static void main(String[] args) {
        ToureConstructor pegas = new ToureConstructor("Pegas");

        Client sergey = new Client("Sergey", 5680);

        pegas.addTourePackade(new TourePackage("USA", "NY", TourPackageType.SHOPPING, Transport.PLANE, Food.NOT_FOOT, 14, 2579));
    }
}
