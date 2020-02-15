package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[20];
        int[] halfArrayOne = new int[10];
        int[] halfArrayTwo = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                halfArrayOne[i] = array[i];
            } else if (i >= 10) {
                System.out.println(halfArrayTwo[i - 10] = array[i]);
            }

        }
    }
}
