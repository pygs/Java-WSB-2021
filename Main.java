package com.company;

import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis");
        dog.name = "Szarik";
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

        Application abirds = new Application("Angry Birds", "v. 2.3.9", 4.99);
        Application spoti = new Application("Spotify", "v. 2.1.10", 0.0);
        Application phmath = new Application("Photomath", "v. 1.4", 14.99);
        Application wiri = new Application("Wild Rift", "v. 2.1", 0.0);
        Application froggy = new Application("Żappka", "v. 1.6", 0.0);
        Application mc = new Application("Minecraft", "1.16.2", 24.99);
        Oneplus.installAnApp(abirds, me);
        Oneplus.isAppInstalled(abirds);
        Oneplus.isAppInstalled("Angry Birds");
        Oneplus.isAppInstalled(spoti);
        Oneplus.isAppInstalled("Spotify");
        Oneplus.installAnApp(spoti, me);
        Oneplus.installAnApp(phmath, me);
        Oneplus.installedAppsValue();
        Oneplus.installAnApp(wiri, me);
        Oneplus.installAnApp(froggy, me);
        Oneplus.freeApps();
        Oneplus.installAnApp(mc, me);
        Oneplus.installedAppsValue();
        Oneplus.appsAlphabeticalSort();
        Oneplus.appPriceSort();
    }
}
