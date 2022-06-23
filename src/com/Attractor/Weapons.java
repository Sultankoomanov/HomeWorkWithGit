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
    public int force(Weapons chooseWeapon) {
        if (this == chooseWeapon)
            return 0;
        switch (this) {
            case ROCK:
                return (chooseWeapon == SCISSORS ? 1 : -1);
            case PAPER:
                return (chooseWeapon == ROCK ? 1 : -1);
            case SCISSORS:
                return (chooseWeapon == PAPER ? 1 : -1);
        }
        return 0;
    }
}
