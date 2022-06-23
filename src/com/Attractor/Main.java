package com.Attractor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        gameVersion();
    }

    private static void gameVersion() {
        System.out.println("В какую версию хотите сыграть?");
        System.out.println("Введите: Стандартная = 1 | Сложная = 2");
        Scanner scanner1 = new Scanner(System.in);
        int game = scanner1.nextInt();


        if (game == 1) {
            Run();
        } else if (game == 2) {
            Run2();
        }
    }

    private static void Run() {
        User user = new User();
        Computer computer = new Computer();
        int userBalls = 0;
        int compBalls = 0;
        int gameCount = 0;

        while (true) {
            printStart();

            Weapons u = user.simpleGame();
            Weapons c = computer.simpleGame();
            System.out.println(" Выбор игрока " + u);
            System.out.println(" Выбор компьютера " + c);

            int winner = u.force(c);
            switch (winner) {
                case 0:
                    System.out.println("Ничья!");
                    break;
                case 1:
                    System.out.println(u + " против " + c + " Победил ИГРОК!");
                    userBalls++;
                    break;
                case 2:
                    System.out.println(u + " против " + c + " Победил КОМПЬЮТЕР!");
                    compBalls++;
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }
            gameCount++;

            double statistic = Math.floor(((double) userBalls / (double) gameCount) * 100);
            int tie = Math.abs((userBalls + compBalls) - gameCount);
            System.out.println("------------------------------------------------------");
            System.out.println("Победа | Поражение | Ничья | Всего игр | Процент побед");
            System.out.printf("%S      | %S         |   %S  |        %S   |    %S \n",
                    userBalls, compBalls, tie, gameCount, statistic);
            System.out.println("------------------------------------------------------");
        }
    }
    private static void Run2() {
        User user = new User();
        Computer computer = new Computer();
        int userBalls = 0;
        int compBalls = 0;
        int gameCount = 0;


        while (true) {
            printStart2();

            Weapons u = user.hardGame();
            Weapons c = computer.hardGame();
            System.out.println(" Выбор игрока " + u);
            System.out.println(" Выбор компьютера " + c);

            int winner = u.force(c);
            switch (winner) {
                case 0:
                    System.out.println("Ничья!");
                    break;
                case 1:
                    System.out.println(u + " против " + c + " Победил ИГРОК!");
                    userBalls++;
                    break;
                case 2:
                    System.out.println(u + " против " + c + " Победил КОМПЬЮТЕР!");
                    compBalls++;
                    break;
                default:
                    System.out.println("Что-то пошло не так");
            }
            gameCount++;

            double statistic = Math.floor(((double) userBalls / (double) gameCount) * 100);
            int tie = Math.abs((userBalls + compBalls) - gameCount);
            System.out.println("------------------------------------------------------");
            System.out.println("Победа | Поражение | Ничья | Всего игр | Процент побед");
            System.out.printf("%S      | %S         |   %S  |        %S   |    %S \n",
                    userBalls, compBalls, tie, gameCount, statistic);
            System.out.println("------------------------------------------------------");
            System.out.println();
        }
    }


    private static void printStart() {
        System.out.println("Игра началась!!!");
        System.out.println("Выберите чем играть:");
        System.out.println("1 = Камень | 2 = Бумага | 3 = Ножницы");
    }

    private static void printStart2() {
        System.out.println("Игра началась!!!");
        System.out.println("Выберите чем играть:");
        System.out.println("1 = Камень | 2 = Бумага | 3 = Ножницы | 4 = Ящерица | 5 = Спок");
    }
}
