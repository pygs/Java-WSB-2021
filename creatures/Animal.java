package com.company.creatures;

public abstract class Animal {
        final public String species;
        private Double weight;
        public String name;
        public Boolean alive;


        public String toString() {
            return species + " " + name + " " + weight;
        }

        public Animal(String species) {
            this.species = species;
            alive = true;

            if (this.species == "canis") {
                this.weight = 10.0;
            } else if (this.species == "felis") {
                this.weight = 2.0;
            } else if (this.species == "homo sapiens") {
                this.weight = 80.0;
            } else {
                this.weight = 1.0;
            }
        }

        public void feed() {
            if (this.weight > 0) {
                System.out.println("You fed " + name + ".");
                System.out.println(this.weight);
            } else {
                System.out.println("It's that hard to put food in the bowl, right?");
            }
        }
        public void feed(Double foodWeight){
            if (this.weight > 0) {
                System.out.println("You fed " + name + ".");
                this.weight += foodWeight;
                System.out.println(this.weight);
            } else {
                System.out.println("It's that hard to put food in the bowl, right?");
            }
        }

        public void takeForAWalk() {
            if (this.weight > 0) {
                System.out.println("You took " + name + " for a walk.");
                this.weight -= 1;
                System.out.println(this.weight);
            } else {
                System.out.println("It's stiff as stick, so it won't walk anymore");
            }
        }

        void kill() {
            this.alive = false;
        }


        public void sell(Human buyer, Human seller, Double price) {
            if (buyer.pet != this) {
                if (buyer.cash > price) {
                    buyer.pet = this;
                    seller.pet = null;
                    seller.cash += price;
                    buyer.cash -= price;
                    System.out.println(name + " was sold.");
                } else {
                    System.out.println("Low on cash");
                }
            }
            else{
                    System.out.println("No animal");
                }
        }

    }
