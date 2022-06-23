package com.Attractor;

public enum Weapons {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),
    LIZARD("Lizard"),
    SPOCK("Spock");

    private String value;

    Weapons(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public int force (Weapons chooseWeapon) {
        if (this == chooseWeapon)
            return 0;
        switch (this) {
            case ROCK:
                return (chooseWeapon == SCISSORS ? 1 : 2);
            case PAPER:
                return (chooseWeapon == ROCK ? 1 : 2);
            case SCISSORS:
                return (chooseWeapon == PAPER ? 1 : 2);
            case LIZARD:
                return (chooseWeapon == SPOCK ? 1 : 2);
            case SPOCK:
                return (chooseWeapon == LIZARD ? 1 : 2);
        }
        return 0;
    }
}
