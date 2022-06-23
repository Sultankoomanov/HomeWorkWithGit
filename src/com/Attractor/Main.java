package com.Attractor;

public class Main {

    public static void main(String[] args) {
        Run();
    }

    private static void Run() {
        printStart();

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
