package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код May is the 5 month
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> month = new HashMap<Integer, String>();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
        month.put(9,"September");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");



        String yourMonth = reader.readLine();
        Iterator<Map.Entry<Integer, String>> iterator = month.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> pair = iterator.next();
            if (yourMonth.equals(pair.getValue()))
                System.out.println(pair.getValue() + " is the " + pair.getKey() + " month");//напишите тут ваш код

        }
    }

}
