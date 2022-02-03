package com.company.creatures;

import com.company.devices.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class Human extends Animal{
    private static final Integer DEFAULT_garageSize = 3;
    public static final String HUMAN_SPECIES = "homo sapiens";
    public static final Double DEFAULT_SALARY = 1000.0;
    public String firstName;
    public String lastName;
    public Integer age;
    private Double salary;
    public Animal pet;
    private Car[] garage;
    public Phone mobile;
    public Double cash;

    public Human(String firstName, String lastName, Integer age, Double salary){
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.garage = new Car[DEFAULT_garageSize];
        this.cash = this.salary;
    }

    public Human(String firstName, String lastName, Integer age, Double salary, Integer garageSize){
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.garage = new Car[garageSize];
        this.cash = this.salary;
    }

    public String toString(){
        return firstName + " " + lastName + " " + age + " " + salary;
    }

    public void introduceYourself(){
        System.out.println("my name is " + firstName);
        System.out.println("my lastname is " + lastName);
    }

    public Double getSalary(){
        System.out.println("Data was taken " + new Date() + " . " + this.salary);
        return this.salary;
    }

    public void setSalary(double sal){
        if (sal < 0){
            System.out.println("Nice negative salary.");
        }
        else{
            System.out.println("New data was sent to database.");
            System.out.println("You need to take annex to the contract from Mrs. Hania from staff");
            System.out.println("ZUS and US knows about salary change and you don't need to hide it");
            this.salary = sal;
        }
    }

    public Car getCar(Integer garageSpot){
        if(this.garage[garageSpot] == null){
            System.out.println("Empty");
        }
        else{
            System.out.println(this.garage[garageSpot]);
        }
            return this.garage[garageSpot];
    }

    public void setCar(Car auto, Integer garageSpot){
        if(this.garage[garageSpot] != null){
            System.out.println("Garage spot occupied by another car.");
        }
        else if (this.salary >= auto.value) {
            System.out.println("You bought this car with your own money. Congratulations!");
            this.garage[garageSpot] = auto;
        }
        else if (this.salary >= (auto.value/12)){
            System.out.println("You bought this car with loan. Bit sad, but hey, you have a car.");
            this.garage[garageSpot] = auto;
        }
        else{
            System.out.println("Sign up for college and find new job or pray for a rise");
        }
    }
    public void sell(Human buyer, Human seller, Double price){
        System.out.println("Nope, not happening.");
    }

    public Double garageValue(){
        Double value = 0.0;
        for(int i = 0; i < garage.length; i++){
            if(garage[i] != null){
                value += garage[i].value;
            }
        }
        System.out.println("Value: " + value);
        return value;
    }

    class sortByYear implements Comparator<Car>{
        public int compare(Car a, Car b){
            return a.yearOfProduction - b.yearOfProduction;
        }
    }
    public void garageSort(){
        Arrays.sort(this.garage, new sortByYear());
        for(int i = 0; i < garage.length; i++){
            System.out.println(garage[i]);
        }
    }

    public boolean hasCar(Car car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == car){
                return true;
            }
        }
        return false;
    }

    public boolean freeSpot(){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == car){
                garage[i] = null;
            }
        }
    }
    public void addCar(Car car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == null){
                garage[i] = car;
            }
        }
    }
}
