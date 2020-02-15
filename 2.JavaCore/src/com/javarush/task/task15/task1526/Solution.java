package com.javarush.task.task15.task1526;

/* 
Дебаг, дебаг, и еще раз дебаг
Программа выводит 0 9, а должна 6 9. Найди одну! ошибку и исправь.
*/

public class Solution {
    public static void main(String[] args) {
        new B(6); // запускаем конструктор B
    }

    public static class A {
        private int f1 = 7;

        public A(int f1) { // конструктор А(6)
            this.f1 = f1; // присваем в переменную (private int f1) значение 6
            initialize(); // выводим 6
        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) { // конструктор B(6)
            super(f1); // вызываем конструктор А(6)
            this.f1 += f1; // добавляем к 3 + 6 = 9
            initialize(); // выводим 9
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }
}
