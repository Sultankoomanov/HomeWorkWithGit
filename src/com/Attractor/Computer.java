package com.Attractor;

import java.util.Random;

public class Computer extends Gamers{
    private String name;


    @Override
    public Weapons simpleGame() {
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

    @Override
    public Weapons hardGame() {
        Random random = new Random();
        int rnd = random.nextInt(5)+1;
        if (rnd == 1) {
            return Weapons.ROCK;
        } else if (rnd == 2) {
            return Weapons.PAPER;
        } else if (rnd == 3) {
            return Weapons.SCISSORS;
        } else if (rnd == 4) {
            return Weapons.LIZARD;
        } else if (rnd == 5) {
            return Weapons.SPOCK;
        }  else return null;
    }

}
