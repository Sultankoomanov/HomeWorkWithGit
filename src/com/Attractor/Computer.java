package com.Attractor;

import java.util.Random;

public class Computer extends Gamers{
    private String name;


    @Override
    public Weapons GameRules(Weapons weapons) {
        Random random = new Random();
        int rnd = random.nextInt(3)+1;
        if (rnd == 1) {
            return Weapons.ROCK;
        } else if (rnd == 2) {
            return Weapons.PAPER;
        } else if (rnd == 3) {
            return Weapons.SCISSORS;
        } else return null;
    }
}
