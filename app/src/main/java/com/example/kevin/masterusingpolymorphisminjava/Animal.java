package com.example.kevin.masterusingpolymorphisminjava;

public class Animal {

    private String animalName;
    private String animalColor;
    private int animalPower;
    private int animalSpeed;


    public Animal(String animalName, String animalColor, int power, int speed) {

        if (power <= 0) {
            throw new IllegalArgumentException("The Value of the Power must be greater than 0 ");
        }
        if (speed <= 0) {
            throw new IllegalArgumentException("The Value of the Speed must be greater than 0");
        }


        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalPower = power;
        this.animalSpeed = speed;
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public int getAnimalPower() {
        return animalPower;
    }

    public void setAnimalPower(int animalPower) {
        this.animalPower = animalPower;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }
}