package com.Attractor;

public enum Weapons {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String value;

    Weapons(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
