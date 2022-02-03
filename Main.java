package com.company;

import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis");
        dog.name = "Szarik";

        System.out.println("nazwa psa: " + dog.name);

        Pet cat = new Pet("felis");
        cat.name = "Sierściuch";
        Phone Oneplus = new Phone("6", "Oneplus", 2017, 2300.0, 6.6, "Android 11");

        Human me = new Human("Jakub", "Wasiniewski", 21, 5000000.0);
        me.pet = cat;
        me.mobile = Oneplus;
        

        Human brother = new Human("Michał", "Wasiniewski", 33, 3500.0, 1);

        Human someone = new Human("Adam", "Szuta", 21, 2300.0);
        someone.pet = dog;

        LPG auto1 = new LPG("Fabia", "Skoda", 2003, 5000.0, "Hatchback", 236000.0, Boolean.TRUE);
        LPG auto2 = new LPG("Rav4", "Toyota", 2019, 100000.0, "SUV", 9000.0, Boolean.FALSE);
        Electric Cybertruck = new Electric("Cybertruck", "Tesla", 2023, 160000.0, "SUV", 0.0, Boolean.TRUE);

        dog.feed();
        dog.feed(2.0);

        auto1.refuel();
        Cybertruck.refuel();
        me.getCar(1);

        me.setCar(auto1, 0);
        me.setCar(auto2, 1);
        me.setCar(Cybertruck, 2);
        me.getCar(2);
        me.garageValue();
        me.garageSort();
        auto1.sell(brother, me, 5000.0);
        auto1.sell(brother, me, 2000.0);
        auto2.sell(brother, me, 100.0);
        auto1.sell(brother, me, 2000.0);
        auto1.sell(brother, someone, 100.0);

        auto1.lastOwner();
        auto1.transactionList(someone, me);
        auto1.transactionList(me, brother);
        auto1.transactionCount();
        auto1.wasOwner(someone);
        auto1.wasOwner(me);

    }
}
