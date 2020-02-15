package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int digit1= Integer.parseInt(reader.readLine());
        int digit2= Integer.parseInt(reader.readLine());
        if(Integer.compare(digit1,digit2)>0){
            System.out.println(digit2);
        }else if ((Integer.compare(digit1,digit2)<0)){
            System.out.println(digit1);
        }else {
            System.out.println(digit1);
        }
    }
}