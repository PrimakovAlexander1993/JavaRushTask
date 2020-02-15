package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());

        if (one == two){
            System.out.println("3");
        }else if (two == three){
            System.out.println("1");
        }else if (one==three){
            System.out.println("2");
        }

    }
}
