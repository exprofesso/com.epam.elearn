package com.epam.elearn.basicsOfOop.fourth.cave;

import com.epam.elearn.basicsOfOop.fourth.treasure.Treasure;
import com.epam.elearn.basicsOfOop.fourth.treasure.TreasureMaterial;
import com.epam.elearn.basicsOfOop.fourth.treasure.TreasureType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cave {
    Treasure treasure;
    List<Treasure> treasureList;

    public Cave() {
        treasureList = new ArrayList<>();
        generationTreasure();
    }


    // заполение пещеры
    private void generationTreasure() {
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            String name = "Опись сокровищь " + i;
            treasureList.add(new Treasure(name, TreasureType.values()[new Random().nextInt(TreasureType.values().length)], TreasureMaterial.values()[new Random().nextInt(TreasureMaterial.values().length)], random.nextInt(2000)));
        }
    }

    public void showTreasure() {
        treasureList.forEach(System.out::println);
    }

    // поиск самого какой самый дорогой

    public void mostExpensive() {
        int temp = 0;
        for (Treasure treasure : treasureList) {
            if (temp < treasure.getPrice()) {
                temp = treasure.getPrice();
            }
        }
        for (Treasure treasure : treasureList) {
            if (temp == treasure.getPrice()) {
                System.out.println(treasure);
            }
        }
    }


}
