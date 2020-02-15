package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        String ss = reader.readLine();
        int b = Integer.parseInt(ss);

        String sss = reader.readLine();
        int c = Integer.parseInt(sss);

        if ((a <= b) && (b <= c)) {
            System.out.println(c + " " + b + " " + a);
        } else {
            if ((a <= c) && (c <= b)) {
                System.out.println(b + " " + c + " " + a);
            } else {
                if ((b <= a) && (a <= c)) {
                    System.out.println(c + " " + a + " " + b);
                } else {
                    if ((b <= c) && (c <= a)) {
                        System.out.println(a + " " + c + " " + b);
                    } else {
                        if ((c <= a) && (a <= b)) {
                            System.out.println(b + " " + a + " " + c);
                        } else {
                            System.out.println(a + " " + b + " " + c);
                        }
                    }
                }
            }
        }

    }
}
