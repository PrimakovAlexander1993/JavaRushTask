package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String nameOne =reader.readLine();
        String nameTwo =reader.readLine();
        if (nameOne.equals(nameTwo)){
            System.out.println("Имена идентичны");
        }else if (nameOne.length() == nameTwo.length()){
            System.out.println("Длины имен равны");
        }
    }
}
