package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String name = reader.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(name)) {
                ArrayList<Integer> list = new ArrayList<>();
                while (fileInputStream.available() > 0) {
                    list.add(fileInputStream.read());
                }
                Collections.sort(list);
                System.out.println(list.get(0));
            }
        }
    }
}
