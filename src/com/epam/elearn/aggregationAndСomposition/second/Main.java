package com.epam.elearn.aggregationAndСomposition.second;

public class Main {
    public static void main(String[] args) {

        Car pepelac = new Car("Пепелац");
        System.out.println("Самая модная машина это " + pepelac.getNameCar());
        pepelac.run();
        System.out.println("**********");

        Engine engine = new Engine(1000, 11.8);
        pepelac.setEngine(engine);
        System.out.println("С такой гравицапой мощностью в " + engine.getPower() + "  коней и таким объемом " + engine.getVolume() + " литров можно гонять во всю мощь!");
        pepelac.run();
        System.out.println("********");

        Wheel wheel = new Wheel(19);
        Wheel wheel2 = new Wheel(19);
        Wheel wheel3 = new Wheel(19);
        Wheel wheel4 = new Wheel(19);
        pepelac.setWheels(wheel, wheel2, wheel3, wheel4);
        pepelac.run();
        System.out.println("**********");

        pepelac.getWheelsId(2).breakWheel();
        System.out.println("Вот и прилетеле, потеряли гравицапу, теперь из гаража не выехать");
        pepelac.run();
        System.out.println("*********");

        pepelac.changeWheel();
        System.out.println("Попробуем еще раз");
        pepelac.run();
        System.out.println("*********");

        pepelac.setFuel(false);
        pepelac.run();
        pepelac.reFuel();
        pepelac.run();

    }
}
