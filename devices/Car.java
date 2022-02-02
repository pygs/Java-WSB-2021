package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {
    public String bodyType;
    private Double millage;
    public Boolean manualGear;

    public Car(String model, String producer, Integer yearOfProduction, Double value, String bodyType, Double millage, Boolean manualGear) {
        super(model, producer, yearOfProduction, value);
        this.bodyType = bodyType;
        this.millage = millage;
        this.manualGear = manualGear;
    }

    @Override
    public void turnOn(){
        System.out.println("przekręcam kluczyk");
    }

    Double getmillage() {
        return this.millage;
    }

    void setMillage(Double millage){
        this.millage = millage;
    }

    void drive (Double distance){
        this.millage += distance;
    }

    public void sell(Human buyer, Human seller, Double price){
        if(buyer.auto != this) {
            if (buyer.cash > price) {
                buyer.auto = this;
                seller.auto = null;
                seller.cash += price;
                buyer.cash -= price;
                System.out.println(producer + " " + model + " was sold.");
            } else {
                System.out.println("Low on cash");
            }
        }
        else{
            System.out.println("No car");
        }
    }
    public abstract void refuel();
}

