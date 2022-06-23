package com.Attractor;

public class Main {

    public static void main(String[] args) {
        Run();
    }

    private static void Run() {
        User user = new User();
        Computer computer = new Computer();
        int userBalls = 0;
        int compBalls = 0;
        int gameCount = 0;

        printStart();
        Weapons Weapons;

        Weapons u = user.GameRules();
        Weapons c = computer.GameRules();
        System.out.println(u);
        System.out.println(c);

        int winner = u.force(c);
        switch (winner) {
            case 0:
                System.out.println("Ничья!");
                break;
            case 1:
                System.out.println("Победил ИГРОК!");
                userBalls++;
                break;
            case 2:
                System.out.println("Победил КОМПЬЮТЕР!");
                compBalls++;
                break;
        }
        gameCount++;

    }

    private static void printStart() {
        System.out.println("Игра началась!!!");
        System.out.println("Играть в сложную версию: НАЖМИТЕ 1");
        System.out.println("Играть в обычную версию: НАЖМИТЕ 2");
        System.out.println("Выберите чем играть:");
        System.out.println("1 = Камень");
        System.out.println("2 = Бумага");
        System.out.println("3 = Ножницы");
    }
}
