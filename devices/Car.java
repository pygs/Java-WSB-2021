package com.company.devices;

import com.company.Device;
import com.company.creatures.Human;

public class Car extends Device {
    public String bodyType;
    private Double millage;
    public Boolean manualGear;

    public Car(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
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
        if(buyer.getSalary()>price){
            buyer.auto = this;
            seller.auto = null;
            seller.cash += price;
            buyer.cash -= price;
            System.out.println(producer + " " + model + " was sold.");
        }
        else{
            System.out.println("Low on cash");
        }
    }
}
