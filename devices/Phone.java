package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;

public class Phone extends Device implements Saleable {
    final Double screensize;
    String os;
    public static final String DEFAULT_appVersion = "1.0";
    public static final String DEFAULT_appServer = "play.google.com/store/apps";
    public static final String DEFAULT_protocol = "https";

    public Phone(String model, String producer, Integer yearOfProduction, Double value, Double screensize, String os) {
        super(model, producer, yearOfProduction, value);
        this.screensize = screensize;
        this.os = os;
    }

    @Override
    public void turnOn() {
        System.out.println("klikam guzik");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price){
        if(buyer.mobile != this) {
            if (buyer.cash > price) {
                buyer.mobile = this;
                seller.mobile = null;
                seller.cash += price;
                buyer.cash -= price;
                System.out.println(producer + " " + model + " was sold.");
            } else {
                System.out.println("Low on cash");
            }
        }
        else{
            System.out.println("No phone");
        }
    }
    public void installAnApp(String appName){
        this.installAnApp(appName, DEFAULT_appVersion);
    }

    public void installAnApp(String appName, String version){
        this.installAnApp(appName, version, DEFAULT_appServer);
    }

    public void installAnApp(String appName, String version, String serverAdress){
        try{
            URL url = new URL(DEFAULT_protocol, serverAdress, 5228, appName + "-" + version);
            this.installAnApp(url);
        }
        catch (MalformedURLException e){
            System.out.println("Null");
            e.printStackTrace();
        }
    }

    public void installAnApp(List<String> appNames){
        for(String appName : appNames){
            this.installAnApp(appName);
        }
    }
    public void installAnApp(URL urlAdress){
        System.out.println("Installing app from: " + urlAdress);
    }
}
