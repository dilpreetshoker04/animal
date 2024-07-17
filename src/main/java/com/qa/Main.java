package com.qa;

import com.qa.animal.Animal;
import com.qa.animal.Mammal;

public class Main {
    public static void main(String[] args) {
//        Animal persianCat = new Animal("persian");
//        System.out.printf("This is a %s cat\n",persianCat.getSpecies());
//        System.out.printf("This %s cat is %d years old\n", persianCat.getColour(), persianCat.getAge());
//
//        Animal oldYellowCat = new Animal(7, "red");
//        System.out.println(oldYellowCat);
//        System.out.printf("This %d year old %s cat is from the %s species\n",
//                oldYellowCat.getAge(), oldYellowCat.getColour(), oldYellowCat.getSpecies());
//
//        catWithDefaultConstructor();
        Animal[] animals = new Animal[5];
        animals[0]= new Mammal("persian",10,"black","Middle East",4);
        animals[1] = new Mammal("platapous",10,"blue","Far East",4);
        animals[2]= new Mammal("greyhound",13,"brown","Europe",4);
        animals[3]= new Mammal("elephant",30,"Grey",10);
        animals[4]= new Mammal("Homosapiens",23,"mixed race",25);
        int startingSpeed = 10;
        for (Animal animal: animals){
            animal.setAverageSpeed(++startingSpeed);
            System.out.printf("Average Speed passsed through: %d\n",startingSpeed);
            System.out.printf("Average speed set through Polymorphism: %d\n",animal.getAverageSpeed());
        }
    }

    public static void catWithDefaultConstructor() {
        Animal cat = new Animal();
        int age = 3;
        cat.setAge(age);
        System.out.printf("This cat is %d years\n",cat.getAge());

        String colour = "orange";
        cat.setColour(colour);
        System.out.printf("This cat is\n", cat.getColour());

        String dietType = "carnivore";
        cat.setDietType(dietType);
        System.out.printf("This cat is a %s\n", cat.getDietType());
        cat.setAverageSpeed(10);
        int distanceCoveredIn10s = cat.getDistanceFromTime(20);
        System.out.printf("This cat can cover %d kms in 10 seconds\n", distanceCoveredIn10s);


        // Weight is assumed to be in kg
        double weight = 5.0;
        cat.setWeight(weight);
        System.out.printf("This cat weighs %f kg\n",cat.getWeight());

        String species = "Siamese";
        cat.setSpecies(species);
        System.out.printf("This is a %s cat\n",cat.getSpecies());
    }
}