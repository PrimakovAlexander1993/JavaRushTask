package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {

        private int countIndexUP = 1;
        private Thread thread;

        public CountUpRunnable() {
            thread = new Thread();
            thread.start();
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    ++countIndexUP;
                    if (countIndexUP > number) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUP;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) {
                        return;
                    }
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
