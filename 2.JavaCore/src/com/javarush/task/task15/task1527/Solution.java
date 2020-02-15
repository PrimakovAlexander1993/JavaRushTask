package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String url = br.readLine();
        int n = url.indexOf('?'); //находим значение индекса
        String u1 = url.substring(n + 1); // вырезали нужную нам строку после ?
        ArrayList<String> list = new ArrayList<>();
        String value = "";

        for (String temp : u1.split("&")) {
            int i = 0;
            for (String t1 : temp.split("=")) {
                if (i == 0)
                    list.add(t1);
                i++;
                if (t1.contentEquals("obj")) {
                    value = temp.substring(4);
                }
            }
        }
        for (String a : list) {
            System.out.print(a + " ");
        }
        System.out.println();

        if (value != "") {
            try {
                alert(Double.parseDouble(value));
            } catch (Exception e) {
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
