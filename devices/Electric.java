package com.company.devices;
import com.company.devices.Car;

public class Electric extends Car{
    public Electric(String model, String producer, Integer yearOfProduction, Double value, String bodyType, Double millage, Boolean manualGear){
        super(model, producer, yearOfProduction, value, bodyType, millage, manualGear);
    }
    @Override
    public void refuel() {
        System.out.println("Charging...");
    }
}
