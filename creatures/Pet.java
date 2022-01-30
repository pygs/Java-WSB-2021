package com.company.creatures;
import com.company.creatures.Animal;

public class Pet extends Animal{
    public Pet(String species){
        super(species);
        this.alive = true;
    }
}
