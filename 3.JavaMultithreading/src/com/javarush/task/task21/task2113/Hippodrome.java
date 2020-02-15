package com.javarush.task.task21.task2113;


import java.util.*;
/*
Теперь вернемся к методам move и print. Начнем с move.

В методе move класса Hippodrome в цикле у каждой лошади мы вызываем метод move.

Да ты прав, его еще нет у класса Horse.

Поэтому в класс Horse надо добавить свой метод move :)

И метод print, кстати тоже.

Если я не говорю ничего насчет параметров метода, значит метод без параметров.

Делай все методы public, если явно не указано обратное.


Требования:
1. В классе Horse должен быть создан метод move.
2. В классе Horse должен быть создан метод print.
3. В методе move класса Hippodrome должен быть вызван метод move по одному разу для каждой лошади(каждого элемента списка horses). */

public class Hippodrome {
    private static List<Horse> horses = new ArrayList<>();
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : getHorses()) {
            horse.print();

        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        HashMap<Horse, Double> map = new HashMap<>();
        map.put(getHorses().get(0), getHorses().get(0).getDistance());
        map.put(getHorses().get(1), getHorses().get(1).getDistance());
        map.put(getHorses().get(2), getHorses().get(2).getDistance());
        ArrayList<Double> list = new ArrayList<>();
        for (Map.Entry<Horse, Double> pair : map.entrySet()) {
            list.add(pair.getValue());
        }
        Horse winner = null;
        Collections.sort(list);
        for (Map.Entry<Horse, Double> pair : map.entrySet()) {
            if (pair.getValue() == list.get(2)) {
                winner = pair.getKey();
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {

        Horse horse = new Horse("One", 3.0, 0.0);
        Horse horse2 = new Horse("Two", 3.0, 0.0);
        Horse horse3 = new Horse("Tree", 3.0, 0.0);

        horses.add(horse);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
