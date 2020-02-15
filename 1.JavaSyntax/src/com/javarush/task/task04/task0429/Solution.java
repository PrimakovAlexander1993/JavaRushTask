package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counterPol = 0;
        int counterNeg = 0;
        for (int i = 0; i < 3; i++) {
            int digit = Integer.parseInt(reader.readLine());
            if (digit > 0) {
                counterPol++;
            } else if (digit < 0) {
                counterNeg++;
            }else if (digit ==0){
                continue;
            }
        }

        System.out.println("количество отрицательных чисел: " + counterNeg);
        System.out.println("количество положительных чисел: " + counterPol);
    }
}
