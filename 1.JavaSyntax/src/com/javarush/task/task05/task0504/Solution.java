package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat0= new Cat("Vasya", 15, 32, 45);
        Cat cat1= new Cat("Jack", 15, 34, 55);
        Cat cat2= new Cat("Vasa", 5, 32, 52);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}