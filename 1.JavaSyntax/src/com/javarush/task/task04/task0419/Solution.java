package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit1 = Integer.parseInt(reader.readLine());
        int digit2 = Integer.parseInt(reader.readLine());
        int digit3 = Integer.parseInt(reader.readLine());
        int digit4 = Integer.parseInt(reader.readLine());

        int res1 = max(digit1,digit2);
        int res2 = max(digit3,digit4);
        System.out.println(max(res1,res2));


    }
}
