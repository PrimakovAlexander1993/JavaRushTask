package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minutes = Double.parseDouble(reader.readLine());
        if (minutes > 5) {
            minutes = minutes % 5;
        }
        if (minutes > 0 && minutes < 3 || minutes ==5) {
            System.out.println("зеленый");
        } else if (minutes >= 3 && minutes < 4) {
            System.out.println("желтый");
        } else if (minutes >=4 && minutes <5) {
            System.out.println("красный");
        }
    }
}