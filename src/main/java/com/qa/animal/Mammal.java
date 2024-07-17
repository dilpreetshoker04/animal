package com.qa.animal;

public class Mammal extends Animal{
    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    private int noOfLegs;

    public int getFastestSpeed() {
        return fastestSpeed;
    }

    public void setFastestSpeed(int fastestSpeed) {
        this.fastestSpeed = fastestSpeed;
    }

    private int fastestSpeed;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;


    public Mammal(String species, int age, String colour,int fastestSpeed, String location,int noOfLegs){
        super(species, age, colour);
        this.fastestSpeed = fastestSpeed;
        this.location = location;
        this.noOfLegs = noOfLegs;
    }
    public Mammal(String species, int age, String colour, String location,int noOfLegs){
        this(species,age,colour,-1,location,noOfLegs);
    }
    public Mammal(String species, int age, String colour, String location){
        this(species,age,colour,location,-1);
    }
    public Mammal(String species, int age, String colour, int fastestSpeed){
        this(species,age,colour,fastestSpeed,"unknown",-1);
    }

    @Override
    public void setAverageSpeed(int averageSpeed) {
        super.setAverageSpeed(10 + averageSpeed);
    }
}
