package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String d = reader.readLine();
        String f = reader.readLine();

        int a = Integer.parseInt(s);
        int b = Integer.parseInt(d);
        int c = Integer.parseInt(f);

        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("Треугольник существует.");
        }

        else
            System.out.println("Треугольник не существует.");
    }
}