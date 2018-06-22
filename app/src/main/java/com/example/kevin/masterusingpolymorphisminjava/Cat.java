package com.example.kevin.masterusingpolymorphisminjava;

public class Cat extends Animal{

    //Constructor
    public Cat(String animalName, String animalColor, int power, int speed) {

        super(animalName, animalColor, power, speed);

    }

    @Override
    public int calculateTheOverallPowerOfAnimal() {
        return super.calculateTheOverallPowerOfAnimal();
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }
}
