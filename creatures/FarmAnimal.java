package com.company.creatures;
import com.company.creatures.Animal;
import com.company.creatures.Edible;

public class FarmAnimal extends Animal{
    FarmAnimal(String species){
        super(species);
        this.alive = true;
    }
public void beEaten(){
        this.alive = false;
}
}
