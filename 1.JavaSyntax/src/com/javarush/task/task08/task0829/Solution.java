package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        //List<String> addresses = new ArrayList<String>();
        HashMap<String, String> hashMap = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            String family = reader.readLine();

            if (family.isEmpty() || city.isEmpty()) {
                break;
            }
            hashMap.put(city,family);
        }

        String cityDeserve = reader.readLine();

        System.out.println(hashMap.get(cityDeserve));



    }
}
