package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них
количество различных букв (для 33 маленьких букв алфавита).
Результат вывести на экран в алфавитном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();//буквы в массиве

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]); // буквы в листе
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) { //вводим 10 строк
            String s = reader.readLine();
            list.add(s.toLowerCase()); // в листе хранятся введенные строки
        }

        HashMap<Character, Integer> map = new HashMap<>(); // буква-повторяемость
        for (int i = 0; i < abcArray.length; i++) {
            char x = abcArray[i];
            int count= 0;
            for (int j = 0; j < list.size(); j++) {
                char[] listWordToChar = list.get(j).toCharArray();
                for (int k = 0; k < listWordToChar.length; k++) {
                    if (listWordToChar[k]==x) count++;
                }
            }
            map.put(x, count);
        }

        for (int i = 0; i < abcArray.length; i++) {
            for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                if (pair.getKey().equals(abcArray[i])){
                    System.out.println(pair.getKey() + " " + pair.getValue());
                }
            }
        }

    }
}
