package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
  Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {
    //напишите тут ваш код
    private String name,color,address;
    private int weight,age;

    public Cat(String name){
        this.name=name;
        this.age=12;
        this.weight=40;
        this.color= "blue";
    }

    public Cat(String name,int weight,int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.color="blue";
    }

    public Cat(String name, int age){
        this.name=name;
        this.weight=12;
        this.age=age;
        this.color= "blue";
    }

    public Cat(int weight,String color){
        this.weight=weight;
        this.color=color;
        this.age= 13;
    }

    public Cat(int weight,String color, String address){
        this.weight=weight;
        this.color=color;
        this.address=address;
        this.age=33;
    }

    public static void main(String[] args) {

    }
}
