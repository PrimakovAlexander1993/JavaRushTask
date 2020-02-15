package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> hashMap= new HashMap<>();
        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int id = 0;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                for (Map.Entry<String,Integer> pair : hashMap.entrySet()){
                    System.out.println( pair.getValue() + " " + pair.getKey() );
                }
                break;
            }
            String name = reader.readLine();

            hashMap.put(name,id);
        }




    }
}
