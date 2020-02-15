package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        String little = list.get(0);
        String big = "";
        int counterB = 0;
        int counterL = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > big.length()) {
                big = list.get(i);
                counterB = i;
            } else if (list.get(i).length() < little.length()) {
                little = list.get(i);
                counterL = i;
            }
        }
        if(counterB < counterL){
            System.out.println(big);
        }else {
            System.out.println(little);
        }
    }
}
