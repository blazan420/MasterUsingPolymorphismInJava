package com.example.kevin.masterusingpolymorphisminjava;

public class Lion extends Animal {


    private boolean canFight = true;
    private int fightingPower;

    public Lion(String animalName, String animalColor, int power, int speed, boolean canFight,
                int fightingPower) {

        super(animalName, animalColor, power, speed);

        if (fightingPower <= 0) {
            throw new IllegalArgumentException("The Value of the Fighting Power must be greagter than" + " 0");
        }

        this.canFight = canFight;
        this.fightingPower = fightingPower;

    }


    public boolean getCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public int getFightingPower() {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }


    @Override
    public int calculateTheOveralPowerOfAnimal() {
        return super.calculateTheOveralPowerOfAnimal() + fightingPower;
    }

    @Override
    public String toString() {
        return  String.format("%s%n%s: %b%n%s: $d", super.toString(),
                "Can our Lion fight?", getCanFight(), "The Fighting Power of our Lion is", getFightingPower());
    }
}

