package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Chak",df.parse("JULY 2 1889"));
        map.put("Chay",df.parse("APRIL 2 1889"));
        map.put("Ch",df.parse("MAY 2 1889"));
        map.put("C",df.parse("JANUARY 2 1889"));
        map.put("Chy",df.parse("FEBRUARY 2 1889"));
        map.put("Chil",df.parse("MAY 2 1889"));
        map.put("Chilly",df.parse("MAY 2 1889"));
        map.put("Com",df.parse("JULY 2 1889"));
        map.put("Cam",df.parse("JULY 2 1889"));

        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String,Date>> iterator =map.entrySet().iterator();
        while (iterator.hasNext()){
            int month=iterator.next().getValue().getMonth();
            if (month >= 5 && month < 8){
                iterator.remove();
            }
        }


    }

    public static void main(String[] args) {

    }
}
