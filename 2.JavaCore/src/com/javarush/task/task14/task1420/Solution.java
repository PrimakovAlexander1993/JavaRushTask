package com.javarush.task.task14.task1420;

/* 
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;



import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int num1 = Integer.parseInt(s);
        String m = reader.readLine();
        int num2 = Integer.parseInt(m);
        if (num1 <= 0 || num2<= 0) throw new Exception();


        int r;
        while (num2 != 0) {
            r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        System.out.println(num1);
    }

}
