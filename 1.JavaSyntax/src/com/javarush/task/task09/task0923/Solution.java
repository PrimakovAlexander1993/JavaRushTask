package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArrayList<Character> listGlas = new ArrayList<>();
        ArrayList<Character> listSoglas = new ArrayList<>();
        char[] mas = string.toCharArray();//массив куда буквы из слова складываю

        for (int i = 0; i < mas.length; i++) {
            if (isVowel(mas[i])) {
                listGlas.add(mas[i]);
            } else listSoglas.add(mas[i]);
        }

        for (Character c : listGlas) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (Character c : listSoglas) {
            if (!c.equals(' ')) {
                System.out.print(c + " ");
            }

        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d)
                return true;
        }
        return false;
    }
}