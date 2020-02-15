package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> map =new HashMap<>();
        map.put("Primakov",5000);
        map.put("Primakova",5000);
        map.put("Gog",50);
        map.put("P",20);
        map.put("Imakov",520);
        map.put("Prima",50);
        map.put("makov",30);
        map.put("ov",200);
        map.put("Primov",60);
        map.put("Priv",90);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Integer>> iterator =map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getValue() < 500){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
       removeItemFromMap(createMap());

    }
}