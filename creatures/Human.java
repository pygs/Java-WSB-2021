package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;


public class Human extends Animal{
    public static final String HUMAN_SPECIES = "homo sapiens";
    public static final double DEFAULT_SALARY = 1000.0;
    public String firstName;
    public String lastName;
    public Integer age;
    private Double salary;
    public Animal pet;
    public Car auto;
    public Phone mobile;
    public Double cash;

    public Human(){
        super(HUMAN_SPECIES);
        this.salary = DEFAULT_SALARY;
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
            cash = this.salary;
        }
    }

    public Car getCar() {
        return this.auto;
    }

    public void setCar(Car auto){
        if (this.salary >= auto.value) {
            System.out.println("You bought this car with your own money. Congratulations!");
            this.auto = auto;
        }
        else if (this.salary >= (auto.value/12)){
            System.out.println("You bought this car with loan. Bit sad, but hey, you have a car.");
            this.auto = auto;
        }
        else{
            System.out.println("Sign up for college and find new job or pray for a rise");
        }
    }
    public void sell(Human buyer, Human seller, Double price){
        System.out.println("Nope, not happening.");
    }
}
