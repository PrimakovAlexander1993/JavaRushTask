package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/


public class Circle {
    //напишите тут ваш код
    int centerX, centerY, radius, width, color;

    public Circle(int centerX, int centerY, int radius){
        this.centerX= centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=12;
        this.color=23;
    }

    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX= centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=23;
    }

    public Circle(int centerX, int centerY, int radius, int width, int color){
        this.centerX= centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }

    public static void main(String[] args) {

    }
}
