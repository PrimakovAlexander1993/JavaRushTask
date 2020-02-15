package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int counter =0;
        boolean c= true;
        while (c){
            int digit= Integer.parseInt(reader.readLine());
            sum += digit;
            counter ++;
            if (digit ==-1){
               c =false;
            }


        }

        System.out.println((double) (sum +1) / (counter-1));
    }
}

