package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
- Имя
- Имя, рост
- Имя, рост, цвет
*/


public class Dog {
    //напишите тут ваш код
    String name,color;
    int height;

    public Dog(String name){
        this.name=name;
        this.height=34;
        this.color="black";
    }

    public Dog(String name, int height){
        this.name=name;
        this.height=height;
        this.color="black";
    }

    public Dog(String name, int height, String color){
        this.name=name;
        this.height=height;
        this.color=color;
    }


    public static void main(String[] args) {

    }
}
