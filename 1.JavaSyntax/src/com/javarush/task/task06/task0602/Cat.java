package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    //напишите тут ваш код


    @Override
    protected void finalize() throws Throwable {
        System.out.println("The cat has just been destroyed");
    }
}

class Dog {
    //напишите тут ваш код

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The dog has just been destroyed");
    }
}
