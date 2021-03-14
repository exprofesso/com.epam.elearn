package com.epam.elearn.aggregationAndСomposition.second;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Car {
    private String nameCar;
    private Engine engine;
    private Wheel[] wheels;
    private boolean isFuel;

    public Car(String nameCar) {
        this.nameCar = nameCar;
        isFuel = true;
        this.wheels = new Wheel[4];
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public Wheel getWheelsId(int id) {
        return wheels[id - 1];
    }

    public void setWheels(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4) {
        this.wheels = new Wheel[]{wheel1, wheel2, wheel3, wheel4};
    }

    public String getNameCar() {
        return nameCar;
    }

    public void changeWheel() {
        for (int i = 0; i < 4; i++) {
            if (!wheels[i].isQuality()) {
                System.out.println("нужно заменить колесо номер " + i + 1);
                int whereToChange = this.wheels[i].getDiameter();
                this.wheels[i] = new Wheel(whereToChange);
            }
        }
    }

    public void setFuel(boolean fuel) {
        this.isFuel = fuel;
    }

    public void reFuel() {
        this.isFuel = true;
        System.out.println("Мы снова заправились!");
    }

    public void run() {
        int count = 0;
        String message = "";
        boolean isEngine = false;

        for (int i = 0; i < 4; i++) {
            if (wheels[i] != null) {
                count++;
            }
        }
        if (count == 0) {
            message = "Колес совсем нет, так не поедем ";
        }
        if (count == 1 || count == 2) {
            message = "Простите, но это не велосипед, надо 4 колеса";
        }
        if (count == 3) {
            message = "Уже совмес близко, но большество машин ездят на 4 колесах";
        }
        System.out.println(message);

        if (engine == null) {
            System.out.println("Без мотора нам никак");
        } else {
            isEngine = true;
        }
        if (isEngine && count == 4) {
            boolean ready = true;
            for (int i = 0; i < 4; i++) {
                if (!wheels[i].isQuality()) {
                    System.out.println("нужно заменить колесо номер " + (i + 1));
                    ready = false;
                }
            }
            if (!isFuel) {
                System.out.println("Этому пепелацу нужна гравицапа");
            } else if (ready) {
                System.out.println("Все отлично, поехали!!!!!!");
            }
        }

    }
}
