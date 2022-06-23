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

        while (true) {
            printStart();

            Weapons u = user.GameRules();
            Weapons c = computer.GameRules();
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
