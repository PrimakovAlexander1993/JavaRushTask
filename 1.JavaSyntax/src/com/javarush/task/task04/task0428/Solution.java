package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int counter =0;
        for (int i = 0; i < 3; i++) {
            int n= Integer.parseInt(reader.readLine());
            if (n>0){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
