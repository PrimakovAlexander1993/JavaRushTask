package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int digit1 = Integer.parseInt(reader.readLine());
        int digit2 = Integer.parseInt(reader.readLine());
        int digit3 = Integer.parseInt(reader.readLine());



        int little = 0;
        int middle = 0;
        int large = 0;

        little = min(min(digit1, digit2), digit3);
        large= max(max(digit1,digit2),digit3);
        if (digit1 !=little && digit1 != large){
            middle=digit1;
        }else if (digit2 != little && digit2 !=large){
            middle =digit2;
        }else if (digit3 != little && digit3 != large){
            middle =digit3;
        }
        if (digit1 == digit2 && digit1 == digit3) {
            System.out.println(digit1);
        }else if (digit1==digit2 || digit1 == digit3) {
            System.out.println(digit1);
        }else if (digit2 == digit3 ) {
            System.out.println(digit2);
        }else {
        System.out.println(middle);
    }
}}
