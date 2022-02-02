package com.company.devices;

public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;
    public Double value;

    public Device(String model, String producer, Integer yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public String toString(){
        return producer + " " + model + " " + yearOfProduction + " " + value;
    }

    public abstract void turnOn();
}
