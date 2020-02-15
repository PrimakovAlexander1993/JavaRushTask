package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i = 1; i < 101; i++) {
            if (i %2 ==0){
                System.out.println(i);
            }

        }
    }
}
