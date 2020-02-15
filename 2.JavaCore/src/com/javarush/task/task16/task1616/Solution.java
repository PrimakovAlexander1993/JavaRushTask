package com.javarush.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем секунды
1. Напиши реализацию метода run в нити Stopwatch (секундомер).
2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
3. Выведи количество секунд в консоль.


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Stopwatch stopwatch = new Stopwatch();//create and run thread
            stopwatch.start();
            reader.readLine();//read a string
            stopwatch.interrupt();
        }

    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //add your code here - добавьте код тут
                Thread thread = Thread.currentThread();
                while (!thread.isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
