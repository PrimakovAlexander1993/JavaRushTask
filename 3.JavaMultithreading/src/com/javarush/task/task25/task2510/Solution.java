package com.javarush.task.task25.task2510;

/*
Поживем - увидим
*/
public class Solution extends Thread {
    public Solution() {
        super.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                if (e instanceof Error) {
                    System.out.println("Нельзя дальше работать");
                } else if (e.getClass() == Throwable.class) {
                    System.out.println("Поживем - увидим");
                }else if (e instanceof Exception) {
                    System.out.println("Надо обработать");
                }
            }
        });
    }

    public static void main(String[] args) {
    }
}