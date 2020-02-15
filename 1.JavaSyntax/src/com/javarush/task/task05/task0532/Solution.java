package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.TreeSet;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int counter = 0;
        int quantity = Integer.parseInt(reader.readLine());
        TreeSet<Integer> set = new TreeSet<Integer>();
        while (counter != quantity) {
            set.add(Integer.parseInt(reader.readLine()));
            counter++;
        }

        int maximum = set.last();

        System.out.println(maximum);
    }
}
