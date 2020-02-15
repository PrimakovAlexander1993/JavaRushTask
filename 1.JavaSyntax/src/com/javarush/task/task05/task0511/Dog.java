package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/


public class Dog {
    //напишите тут ваш код
    // - Имя
    //- Имя, рост
    //- Имя, рост, цвет
    String name, color;
    int height;

    public void initialize(String name) {
        this.name = name;
        this.height = 122;
        this.color = "black";
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
        this.color = "black";
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
