package com.Attractor;

import java.io.IOException;
import java.util.Scanner;

public class User extends Gamers {
    private String name;

    @Override
    public Weapons simpleGame() {
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

    @Override
    public Weapons hardGame() {
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            if (choose == 1) {
                return Weapons.ROCK;
            } else if (choose == 2) {
                return Weapons.PAPER;
            } else if (choose == 3) {
                return Weapons.SCISSORS;
            } else if (choose == 4) {
                return Weapons.LIZARD;
            } else if (choose == 5) {
                return Weapons.SPOCK;
            } else return null;
        }
}

