package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    // Имя,
    //- Имя, вес, возраст
    //- Имя, возраст (вес стандартный)
    //- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    //- вес, цвет, адрес (чужой домашний кот)

    String name,color,address;
    int weight, age;

    public void initialize(String name){
        this.name=name;
        this.age=12;
        this.color="black";
        this.weight=33;
    }

    public void initialize(String name, int weight, int age){
        this.name=name;
        this.age=age;
        this.color="black";
        this.weight=weight;
    }

    public void initialize(String name, int age){
        this.name=name;
        this.age=age;
        this.color="black";
        this.weight=33;
    }

    public void initialize(int weight,String color){
        this.weight=weight;
        this.color=color;
        this.age=44;
    }

    public void initialize(int weight,String color, String address){
        this.weight=weight;
        this.color=color;
        this.address=address;
        this.age=44;
    }
    public static void main(String[] args) {

    }
}
