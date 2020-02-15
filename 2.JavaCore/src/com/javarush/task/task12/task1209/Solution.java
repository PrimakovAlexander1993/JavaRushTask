package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.


*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int x, int y){
        return Integer.min(x,y);
    }

    public static long min(long x, long y){
        return Long.min(x,y);
    }

    public static double min(double x, double y){
        return Double.min(x,y);
    }
}
