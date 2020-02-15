package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(){
        this.radius=4;
        this.x=3;
        this.y=9;
    }
    public Circle(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.radius=z;
    }
    public Circle(double x){
        this.x=x;
        this.y =4;
        this.radius=2;
    }

    public Circle(double x, double y){
        this.x=x;
        this.y=y;
        this.radius=45;
    }

    public static void main(String[] args) {

    }
}