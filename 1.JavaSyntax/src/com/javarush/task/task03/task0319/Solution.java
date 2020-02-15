package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name= reader.readLine();
        int digit1 =Integer.parseInt(reader.readLine());
        int digit2 =Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " +  digit1 + " через "+  digit2 + " лет.");
    }
}
