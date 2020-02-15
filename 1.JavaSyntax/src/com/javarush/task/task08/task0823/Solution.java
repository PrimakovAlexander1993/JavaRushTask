package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++)
            if (i == 0 || stringBuilder.charAt(i - 1) == ' ')
                stringBuilder.setCharAt(i, Character.toUpperCase(stringBuilder.charAt(i)));
        System.out.println(String.valueOf(stringBuilder));


    }
}
