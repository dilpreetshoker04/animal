package com.qa.animal;

public class Animal {

    // Properties

    private int age;
    private String colour;
    private String dietType;
    private double weight;
    private String species;
    private static int averageSpeed;

    // Constructors

    public Animal(String species) {
        this(species,-1,"grey");
    }

    public Animal(String species, int age, String colour) {
        this.species = species;
        this.age = age;
        this.colour = colour;
    }

    public Animal(int age, String colour) {
        this("unknown", age,colour);
    }

    public Animal() {}

    @Override
    public String toString() {
        return "This animal is of " + this.species
                + " species, its colour is " + this.colour +
                " and its age is " + this.age;

    }

    public int getDistanceFromTime(int timeInSeconds){
        return this.averageSpeed*timeInSeconds;

    }
    // Functionality

    public void eat() {
        // Eat action goes here
    }

    public void sleep() {
        // Sleep action goes here
    }

    public void move() {
        // Move action goes here
    }

    // Getters and setters

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static int getAverageSpeed() {
        return averageSpeed;
    }

    public  void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

}