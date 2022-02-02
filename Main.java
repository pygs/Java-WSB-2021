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

        Human me = new Human();
        me.firstName = "Jakub";
        me.lastName = "Wasiniewski";
        me.age = 21;
        me.setSalary(20000.0);
        me.pet = cat;
        me.mobile = Oneplus;
        

        Human brother = new Human();
        brother.firstName = "Michał";
        brother.lastName = "Wasiniewski";
        brother.age = 32;
        brother.setSalary(3000.0);

        Human someone = new Human();
        someone.firstName = "Adam";
        someone.lastName = "Szuta";
        someone.setSalary(2300.0);
        someone.pet = dog;

        LPG auto1 = new LPG("Fabia", "Skoda", 2003, 5000.0, "Hatchback", 236000.0, Boolean.TRUE);
        LPG auto2 = new LPG("Rav4", "Toyota", 2019, 100000.0, "SUV", 9000.0, Boolean.FALSE);
        Electric Cybertruck = new Electric("Cybertruck", "Tesla", 2023, 160000.0, "SUV", 0.0, Boolean.TRUE);

        cat.sell(brother, me, 2000.0);
        me.sell(someone, brother, 2300.0);
        Oneplus.sell(brother, me, 2300.0);

        dog.feed();
        dog.feed(2.0);

        auto1.refuel();
        Cybertruck.refuel();
    }
}
