package com.company.devices;

import com.company.Device;
import com.company.Saleable;
import com.company.creatures.Human;

public class Phone extends Device implements Saleable {
    final Double screensize;
    String os;


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
        if(buyer.cash>price){
            buyer.mobile = this;
            seller.mobile = null;
            seller.cash += price;
            buyer.cash -= price;
            System.out.println(producer + " " + model + " was sold.");
        }
        else{
            System.out.println("Low on cash");
        }
    }

}
