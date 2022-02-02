package com.company.devices;
import com.company.devices.Car;

public class Diesel extends Car{
    public Diesel(String model, String producer, Integer yearOfProduction, Double value, String bodyType, Double millage, Boolean manualGear){
        super(model, producer, yearOfProduction, value, bodyType, millage, manualGear);
    }
    @Override
    public void refuel() {
        System.out.println("Refueling...");
    }
}
