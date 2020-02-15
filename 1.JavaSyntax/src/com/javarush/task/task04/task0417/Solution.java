package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d1 = Integer.parseInt(reader.readLine());
        int d2 = Integer.parseInt(reader.readLine());
        int d3 = Integer.parseInt(reader.readLine());

        if ((d1 == d2) && (d1 == d3)) {
            System.out.println(d1 + " " + d2 + " " + d3);
        } else if ((d1 == d2)) {
            System.out.println(d1 + " " + d2);
        }else if (d2==d3){
            System.out.println(d2 + " " +  d3);
        }else if (d1==d3){
            System.out.println(d1 + " " +  d3);
        }

    }
}