package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    public String bodyType;
    private Double millage;
    public Boolean manualGear;
    public List<Human> owners;

    public Car(String model, String producer, Integer yearOfProduction, Double value, String bodyType, Double millage, Boolean manualGear) {
        super(model, producer, yearOfProduction, value);
        this.bodyType = bodyType;
        this.millage = millage;
        this.manualGear = manualGear;
        this.owners = new ArrayList<Human>();
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
        if(seller.hasCar(this)) {
            if(this.lastOwner() == seller)
                if(buyer.freeSpot()) {
                    if(buyer.cash > price) {
                        seller.removeCar(this);
                        buyer.addCar(this);
                        seller.cash += price;
                        buyer.cash -= price;
                        this.updateOwner(buyer);
                        System.out.println(producer + " " + model + " was sold.");
                    }
                    else {
                        System.out.println("Low on cash");
                    }
                }
                else {
                    System.out.println("No parking spot");
                }
            else {
                System.out.println("Seller is scammer");
            }
            }
        else{
            System.out.println("Seller don't have a car");
        }
        }
    public abstract void refuel();

    public void updateOwner(Human newOwner){
        this.owners.add(newOwner);
        System.out.println("New owner saved in car history.");
    }

    public Human lastOwner(){
        System.out.println("Last owner: " + owners.get(owners.size() - 1).firstName + " " + owners.get(owners.size() - 1).lastName);
        return owners.get(owners.size() - 1);
    }

    public boolean wasOwner(Human human){
        if(owners.contains(human)){
            System.out.println("Yes");
            return true;
        }
        else{
            System.out.println("No");
            return false;
        }
    }

    public Boolean transactionList(Human seller, Human buyer){
        if(!this.wasOwner(seller)){
            System.out.println("This man didn't sell any car");
            return false;
        }
        else{
            if(this.owners.indexOf(buyer) == this.owners.indexOf(seller)){
                System.out.println(seller.firstName + " sold this car to " + buyer.firstName + ".");
                return true;
            }
            else{
                System.out.println(seller.firstName + " didn't sell this car to " + buyer.firstName + ".");
                return false;
            }
        }
    }

    public int transactionCount(){
        System.out.println(this.owners.size());
        return this.owners.size();
    }
}

