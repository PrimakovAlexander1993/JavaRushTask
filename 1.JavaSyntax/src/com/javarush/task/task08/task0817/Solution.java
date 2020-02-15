package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "AA");// фамилия имя
        map.put("B", "AA");
        map.put("C", "BA");
        map.put("D", "FA");
        map.put("E", "JA");
        map.put("F", "TA");
        map.put("G", "KA");
        map.put("H", "EA");
        map.put("I", "sA");
        map.put("J", "BA");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> valuesList = new ArrayList<String>();//сюда кладем значения (НЕ ключи)

        for (Map.Entry<String, String> pair : map.entrySet()) {// положили в лист имена
            valuesList.add(pair.getValue());
        }
        for (int i = 0; i < valuesList.size(); i++) {//до конца листа
            String nameToTest = valuesList.get(i);//смотрим повторяется ли имя
            int count = 0;

            for (Map.Entry<String, String> pair : map.entrySet()) {

                if (nameToTest.equals(pair.getValue())) { //если значение совпадает с итым счетчик ++
                    count++;
                }
            }

            if (count > 1) {
                removeItemFromMapByValue(map, nameToTest);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map); //сделали копию
        for (Map.Entry<String, String> pair : copy.entrySet()) { //идем по копии
            if (pair.getValue().equals(value)) // если в копии есть такое знаичение
                map.remove(pair.getKey());     //то удаляем из оригинала
        }
    }

    public static void main(String[] args) {

    }
}
