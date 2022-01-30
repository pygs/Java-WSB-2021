package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Szarik";

        System.out.println("nazwa psa: " + dog.name);

        Animal cat = new Animal("felis");
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

        Car auto1 = new Car("Fabia", "Skoda", 2003, 5000.0);
        auto1.bodyType = "Hatchback";
        auto1.manualGear = true;

        Car auto2 = new Car("Rav4", "Toyota", 2019, 100000.0);
        auto2.bodyType = "SUV";
        auto2.manualGear = false;

        cat.sell(brother, me, 2000.0);
        me.sell(someone, brother, 2300.0);
        Oneplus.sell(brother, me, 2300.0);
    }
}
