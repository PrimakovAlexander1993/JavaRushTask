package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("One", "Valera");
        hashMap.put("Two", "Alexander");
        hashMap.put("Three", "Alex");
        hashMap.put("Four", "Gena");
        hashMap.put("Five", "Ale");
        hashMap.put("Six", "Alexa");
        hashMap.put("Seven", "Al");
        hashMap.put("Eight", "Alexander");
        hashMap.put("Nine", "Alexander");
        hashMap.put("Ten", "Jora");
        return hashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count =0;
        for (String s : map.values())
            if (s.equals(name))
                count +=1;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int counter = 0;
        if (map.containsKey(lastName)) {
            counter++;
        }

        return counter;

    }

    public static void main(String[] args) {

    }
}
