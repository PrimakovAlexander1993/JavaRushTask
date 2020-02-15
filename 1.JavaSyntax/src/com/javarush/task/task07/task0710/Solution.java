package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = buffer.readLine();
            list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i < 9)
                System.out.println(list.get(i));
            else
                System.out.print(list.get(9));
        }

    }
}
