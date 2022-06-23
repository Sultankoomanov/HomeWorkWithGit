package com.Attractor;

import java.util.Scanner;

public class User extends Gamers {
    private String name;

    @Override
    public Weapons GameRules() {
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        if (choose == 1) {
            return Weapons.ROCK;
        } else if (choose == 2) {
            return Weapons.PAPER;
        } else if (choose == 3) {
            return Weapons.SCISSORS;
        } else return null;
    }
}

