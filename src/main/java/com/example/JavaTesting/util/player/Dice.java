package com.example.JavaTesting.util.player;

import java.util.Random;

public class Dice {

    private final int sides;

    public Dice(int sides){
        this.sides = sides;
    }

    public int roll(){
        return new Random().nextInt(sides) + 1;
    }
}
