package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    // top, left, width, height

    int top, left, width, height;

    public void initialize(int top,int left,int width,int height){
        this.top=top;
        this.height=height;
        this.left=left;
        this.width=width;
    }

    public void initialize(int top,int left,int width){
        this.top=top;
        this.height=20;
        this.left=left;
        this.width=width;
    }

    public void initialize(int top,int left){
        this.top=top;
        this.height=20;
        this.left=left;
        this.width=4;
    }
    public void initialize(int top){
        this.top=top;
        this.height=20;
        this.left=55;
        this.width=44;
    }

    public void initialize(){
        this.top=43;
        this.height=20;
        this.left=44;
        this.width=24;
    }


    public static void main(String[] args) {

    }
}
