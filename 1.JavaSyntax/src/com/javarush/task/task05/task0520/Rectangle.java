package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public Rectangle(int top,int left,int width,int height){
        this.top=top;
        this.left=left;
        this.height=height;
        this.width=width;
    }

    public Rectangle(int top,int left){
        this.top=top;
        this.left=left;
        this.height=0;
        this.width=0;
    }

    public Rectangle(int top,int left, int height){
        this.top=top;
        this.left=left;
        this.height=width;

    }

    public Rectangle(int top){
        this.top=top;
        this.width=34;
        this.left=34;
        this.height=25;
    }




    public static void main(String[] args) {

    }
}
