package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;
import java.net.*;
import java.util.*;

public class Phone extends Device implements Saleable {
    final Double screensize;
    String os;
    public static final String DEFAULT_appVersion = "1.0";
    public static final String DEFAULT_appServer = "play.google.com/store/apps";
    public static final String DEFAULT_protocol = "https";
    public Set<Application> apps = new HashSet<Application>();

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

    public void installAnApp(Application app, Human user){
        if(user.cash >= app.price){
            this.apps.add(app);
            user.cash -= app.price;
            System.out.println(app.name + " installed. Price: " + app.price + " zł.");
        }
        else{
            System.out.println("Not enough money");
        }
    }

    public boolean isAppInstalled(Application app){
        if(this.apps.contains(app)){
            System.out.println("Yes");
            return true;
        }
        else{
            System.out.println("No");
            return false;
        }
    }

    public boolean isAppInstalled(String appName){
        Iterator<Application> app = apps.iterator();
        while(app.hasNext()) {
            if (app.next().name == appName) {
                System.out.println("Yes");
                return true;
            }
        }
        System.out.println("No");
        return false;
    }

    public void freeApps(){
        for(Application app : apps){
            if(app.price == 0.0){
                System.out.println("Free app: " + app.name);
            }
        }
    }

    public void installedAppsValue(){
        Double value = 0.0;
        Iterator<Application> app = apps.iterator();
        while(app.hasNext()){
            value += app.next().price;
        }
        System.out.println("Money spent: " + value);
    }

    public void appsAlphabeticalSort(){
        ArrayList<String> appNames = new ArrayList<String>();
        for(Application app : apps){
            appNames.add(app.name);
        }
        Collections.sort(appNames);
        System.out.println(appNames);
    }

    public void appPriceSort(){
        Application[] x = apps.toArray(new Application[apps.size()]);
        Arrays.sort(x, Comparator.comparing(Application::getPrice));
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}
